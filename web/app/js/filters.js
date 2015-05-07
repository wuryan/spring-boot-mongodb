/**
 * Created by James Chow on 2015/5/7.
 */
'use strict';
angular.module('personsFilters', []).filter('checkmark', function() {
    return function(input) {
        return input ? '\u2713' : '\u2718'
    }
});