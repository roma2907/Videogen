angular.module('generatorVideoApp')
    .controller('VideoController', function ($scope, Video) {
       $scope.generateVideo=function(){
    	    
    	    Video.generate(function(v) {
    	    	$scope.url = v.url;
    	    	$scope.showPlayer=true;
    	    	// get the first player
    	    	// display information about the video type
    	    	flowplayer("#PLAYERID", {
    	    		   wmode: 'direct',
    	    		   plugins: {
    	    		       httpstreaming: {
    	    		           url: '../../flowplayer/flowplayerhls.swf',
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
    	    		       url: "http://localhost:8080/file.m3u8",
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

    	    });
       };
    });