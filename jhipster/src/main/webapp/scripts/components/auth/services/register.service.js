'use strict';

angular.module('generatorVideoApp')
    .factory('Register', function ($resource) {
        return $resource('api/register', {}, {
        });
    });


