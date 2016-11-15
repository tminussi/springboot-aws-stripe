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
                sweetAlert("Thanks...", "Your message has been sent!", "success");
            })
            .catch(function (error) {
                sweetAlert("Oops...", "Something went wrong!", "error");
            });
    }
}]);