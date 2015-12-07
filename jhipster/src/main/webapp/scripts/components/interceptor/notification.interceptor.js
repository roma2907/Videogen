 'use strict';

angular.module('generatorVideoApp')
    .factory('notificationInterceptor', function ($q, AlertService) {
        return {
            response: function(response) {
                var alertKey = response.headers('X-generatorVideoApp-alert');
                if (angular.isString(alertKey)) {
                    AlertService.success(alertKey, { param : response.headers('X-generatorVideoApp-params')});
                }
                return response;
            }
        };
    });
