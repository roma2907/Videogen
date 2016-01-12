angular.module('generatorVideoApp')
    .controller('VignetteController', function ($scope,$http, Vignette) {

    	
    		Vignette.generate(function(v) {
    			console.log(v);
    	    });



        $http.get('http://localhost:8080/api/video/vignettes').success(function (data) {
            $scope.vignettes =data;
        });

    });
