var app = angular.module('springAwsStripe');

app.config(function($routeProvider) {

    $routeProvider.when('/', {
        controller: 'HomeController',
        templateUrl: 'templates/home.html',
        controllerAs: 'vm'
    })
        .when('/aboutUs', {
        controller: 'AboutUsController',
        templateUrl: 'templates/aboutUs.html',
        controllerAs: 'vm'

    })
        .when('/contact', {
            controller: 'ContactController',
            templateUrl: 'templates/contact.html',
            controllerAs: 'vm'

        });
    $routeProvider.otherwise('/');
});