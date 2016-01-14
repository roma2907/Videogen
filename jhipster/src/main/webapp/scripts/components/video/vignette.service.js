'use strict';

angular.module('generatorVideoApp')
    .factory('Vignette', function ($resource) {
        return $resource('api/videos/vignettes', {}, {
                'generate': {
                	method: 'GET',isArray:true,
                	transformResponse: function (data) {
                        data = angular.fromJson(data);
                        return data;
                    }
                },
                'genVignettes':{
                    method: 'POST',
                    transformResponse: function (data) {
                        data = angular.fromJson(data);
                        return data;
                    }

                }
            });
        });



