angular.module('generatorVideoApp')
    .controller('VignetteController', function ($scope,$http, Vignette) {


    		Vignette.generate(function(v) {
    			console.log(v);
                $scope.vignettes = v;
    	    });

        $scope.items = [
            {imageUrl: '/app/img/item1.jpg'},
            {imageUrl: '/app/img/item2.jpg'}
        ];
        $scope.selectedItem = null;

        $scope.selectItem = function(item){
            console.log(item);
            $scope.selectedItem = item;
        };

        $scope.isSelected = function(item){
            if($scope.selectedItem===null){
                return false;
            }
            return item.imageUrl === $scope.selectedItem.imageUrl;
        };

    });
