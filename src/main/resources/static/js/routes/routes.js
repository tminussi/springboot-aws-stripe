var app = angular.module('springAwsStripe');

app.config(function($routeProvider) {

    $routeProvider.when('/', {
        controller: 'HomeController',
        templateUrl: 'templates/home.html',
        controllerAs: 'vm'
    });
    $routeProvider.otherwise('/');
});