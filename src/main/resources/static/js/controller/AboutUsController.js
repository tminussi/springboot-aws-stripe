var app = angular.module('springAwsStripe');

app.controller('AboutUsController', ['AboutUsService', function (AboutUsService) {
    let vm = this;
    AboutUsService.fetchAboutUs()
        .then(function (response) {
            console.log(response);
            vm.aboutUs = response;
        }).catch(function (error) {
            vm.error = error;
    });
}]);