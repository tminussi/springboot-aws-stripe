var app = angular.module('springAwsStripe');

app.factory('ContactService', function ($http) {
    return {
        submitContactForm: submitContactForm
    };

    function submitContactForm(contact) {
        console.log(contact);
        return $http.post('/api/contact', contact)
            .then(success)
            .catch(fail);
    }

    function success(contact) {
        return contact;
    }

    function fail(error) {
        return error.statusText;
    }

});