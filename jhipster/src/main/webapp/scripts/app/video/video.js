angular.module('generatorVideoApp')
    .config(function ($stateProvider) {
        $stateProvider
            .state('video', {
                parent: 'site',
                url: '/video',
                views: {
                    'content@': {
                        templateUrl: 'scripts/app/video/video.html',
                        controller: 'VideoController'
                    }
                }
            });
    });
