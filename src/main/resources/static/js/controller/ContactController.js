var app = angular.module('springAwsStripe');

app.controller('ContactController', ['ContactService', function (ContactService) {
    let vm = this;

    vm.submitContactForm = function () {
        console.log('clicked');
    }
}]);