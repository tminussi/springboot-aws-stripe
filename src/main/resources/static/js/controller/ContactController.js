var app = angular.module('springAwsStripe');

app.controller('ContactController', ['ContactService', function (ContactService) {
    let vm = this;

    vm.submitContactForm = function () {
        let contact = {
            name: vm.name,
            email: vm.email,
            subject: vm.subject,
            message: vm.message
        };
        ContactService.submitContactForm(contact)
            .then(function (success) {
                console.log(success);
            })
            .catch(function (error) {
                console.log(error);
            });
    }
}]);