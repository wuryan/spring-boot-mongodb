/**
 * Created by James Chow on 2015/5/7.
 */
'use strict';

var personApp = angular.module('personApp', [
    'ngRoute',
    'personsControllers',
    'personsFilters'
]);

personApp.config(['$routeProvider',
    function($routeProvider) {
        $routeProvider.
            when('/persons', {
                templateUrl: 'partials/person-list.html',
                controller: 'PersonListCtrl'
            }).
            when('/persons/:personId', {
                templateUrl: 'partials/person-detail.html',
                controller: 'PersonDetailCtrl'
            }).
            otherwise({
                redirectTo: '/persons'
            });
    }
]);