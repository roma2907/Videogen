angular.module('generatorVideoApp')
    .config(function ($stateProvider) {
        $stateProvider
            .state('vignette', {
                parent: 'site',
                url: '/vignette',
                views: {
                    'content@': {
                        templateUrl: 'scripts/app/vignette/vignette.html',
                        controller: 'VignetteController'
                    }
                }
            });
    });
