'use strict';

angular.module('generatorVideoApp')
    .factory('Video', function ($resource) {
        return $resource('api/videos/', {}, {
                'generate': {
                	method: 'GET',
                	transformResponse: function (data) {
                        data = angular.fromJson(data);
                        return data;
                    }
                }
            });
        });