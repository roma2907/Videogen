angular.module('generatorVideoApp')
    .controller('VignetteController', function ($scope, Vignette,VideoPlayer) {

        $scope.selectedItem=null;

		Vignette.generate(function(v) {
            $scope.vignettes = v;
            $scope.showVignette=true;
	    });

        $scope.my_items = [];


        postVideo = function(data){

             Vignette.genVignettes(data, function(res){
                $scope.myUrl = res;
                VideoPlayer.play("PLAYERID",$scope.myUrl.url.replace("src/main/webapp","http://localhost:8080"));
            });

        };

        $scope.removeItem = function(array,item){
            if(array.indexOf(item.ident) !== -1){
                array.splice(array.indexOf(item.ident), 1);
            }
        };

        $scope.selectItem = function(item){
            if($scope.my_items.indexOf(item.ident) !== -1){
                $scope.my_items.splice($scope.my_items.indexOf(item.ident), 1);
            }
            else{
                $scope.my_items.push(item.ident);
            }

            $scope.selectedItem = item.ident;
        };

        $scope.selectItemAltern = function(array,item){
            array.forEach(function(data)
            {

                if($scope.my_items.indexOf(data.ident) !== -1) {
                    $scope.my_items.splice($scope.my_items.indexOf(data.ident), 1);
                }

            });
            $scope.my_items.push(item.ident);
            $scope.selectedItem = item.ident;
        };

        $scope.isSelected = function(item){
            if($scope.my_items.indexOf(item.ident) !== -1){
                return true;
            }
            return false;
        };

        $scope.generateSelectedVideo = function(){
            postVideo($scope.my_items);
        };

    });
