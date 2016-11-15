var app = angular.module('springAwsStripe');

app.factory('ContactService', function ($http) {
    return {
        submitContactForm: submitContactForm
    };

    function submitContactForm() {
        return $http.get('/api/contact')
            .then(success)
            .catch(fail);
    }

    function success(response) {
        return response.data;
    }

    function fail(error) {
        return error.statusText;
    }

});