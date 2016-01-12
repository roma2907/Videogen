'use strict';

angular.module('generatorVideoApp')
    .factory('Vignette', function ($resource) {
        return $resource('api/videos/vignettes', {}, {
                'generate': {
                	method: 'GET',
                	transformResponse: function (data) {
                        data = angular.fromJson(data);
                        return data;
                    }
                }
            });
        });