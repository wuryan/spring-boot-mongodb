/**
 * Created by James Chow on 2015/5/7.
 */
'user strict';
var personsControllers = angular.module('personsControllers', []);

personsControllers.controller('PersonListCtrl', ['$scope', '$http',
    function($scope, $http) {
        $http.get('/api/v/person/all').success(function(data) {
            $scope.persons = data;
        });

        $scope.orderPop = 'age';
    }
]);

personsControllers.controller('PersonDetailCtrl', ['$scope', '$routeParams', '$http',
    function($scope, $routeParams, $http) {
        $http.get('/api/v/person/' + $routeParams.personId).success(function(data) {
            $scope.person = data
        });
    }
]);