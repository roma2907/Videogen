angular.module('generatorVideoApp')
    .controller('VignetteController', function ($scope,$http, Vignette) {

        console.log($scope.selectedItem);

    		Vignette.generate(function(v) {
    			console.log(v);
                $scope.vignettes = v;
    	    });

        $scope.my_items = [];


        postVideo = function(data){

            $http.post("http://localhost:8080/api/videos/vignettes",
                data,
                {headers: {
                    'Access-Control-Allow-Origin': '*'
                }}
            )
                .success(function (data, status, headers, config) {
                    console.log("success");
                    console.log(data);
                    $scope.myUrl = data;
                    play($scope.myUrl.url.replace("src/main/webapp","http://localhost:8080"));

                })
                .error(function (data, status, header, config) {
                });

        };

        $scope.removeItem = function(array,item){
            if(array.indexOf(item.ident) !== -1){
                array.splice(array.indexOf(item.ident), 1);
            }
        };

        $scope.selectItem = function(item){
            console.log(item.ident);
            if($scope.my_items.indexOf(item.ident) !== -1){
                $scope.my_items.splice($scope.my_items.indexOf(item.ident), 1);
            }
            else{
                $scope.my_items.push(item.ident);
            }

            $scope.selectedItem = item.ident;
        };

        $scope.selectItemAltern = function(array,item){
            console.log(array);
            array.forEach(function(data)
            {

                if($scope.my_items.indexOf(data.ident) !== -1) {
                    $scope.my_items.splice($scope.my_items.indexOf(data.ident), 1);
                }

            });
            $scope.my_items.push(item.ident);



        };

        $scope.isSelected = function(item){
            /*if($scope.selectedItem===null){
                return false;
            }
            return item.imageUrl === $scope.selectedItem.imageUrl;*/
        };

        $scope.generateSelectedVideo = function(){
            console.log($scope.my_items);
            postVideo($scope.my_items);
            console.log($scope.myUrl);

        };




        /////////////////////////////////////////////////






play=function(url){
    console.log(url);
    flowplayer("PLAYERID", "http://40ansenfete.irisa.fr/assets/flash/flowplayer.swf", {
        wmode: 'direct',
        plugins: {
            httpstreaming: {
                url: 'http://40ansenfete.irisa.fr/assets/flash/flashlsFlowPlayer.swf',
                hls_debug : false,
                hls_debug2 : false,
                hls_lowbufferlength : 3,
                hls_minbufferlength : 5,
                hls_maxbufferlength : 0,
                hls_startfromlevel : -1,
                hls_seekfromlevel : -1,
                hls_live_flushurlcache : false,
                hls_seekmode : "ACCURATE",
                hls_fragmentloadmaxretry : -1,
                hls_manifestloadmaxretry : -1,
                hls_capleveltostage : false,
                hls_maxlevelcappingmode : "downscale"
            }
        },
        clip: {
            accelerated: true,
            url: url,
            urlResolvers: "httpstreaming",
            lang: "fr",
            provider: "httpstreaming",
            autoPlay: false,
            autoBuffering: true
        },
        log: {
            level: 'none',
            filter: 'org.flowplayer.controller.*'
        }
    });



};






    });
