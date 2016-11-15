var app = angular.module('springAwsStripe');

app.controller('AboutUsController', ['AboutUsFactory', function (AboutUsFactory) {
    let vm = this;
    AboutUsFactory.fetchAboutUs()
        .then(function (response) {
            console.log(response);
            vm.aboutUs = response;
        }).catch(function (error) {
            vm.error = error;
    });
}]);