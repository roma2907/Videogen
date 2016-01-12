angular.module('generatorVideoApp')
    .controller('VignetteController', function ($scope,$http, Vignette) {


    		Vignette.generate(function(v) {
    			console.log(v);
                $scope.vignettes = v;
    	    });

    });
