angular.module('generatorVideoApp')
    .controller('VideoController', function ($scope, Video,VideoPlayer) {
       
    	$scope.generateVideo=function(){
    	    Video.generate(function(v) {
    	    	
    	    	VideoPlayer.play("PLAYERID",v.url.replace("src/main/webapp","http://localhost:8080"));
    	    });
    	}
    });