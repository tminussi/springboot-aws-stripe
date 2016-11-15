var app = angular.module('springAwsStripe');

app.factory('AboutUsFactory', function ($http) {
    return {
      fetchAboutUs: fetchAboutUs
    };
    
    function fetchAboutUs() {
        return $http.get('/api/aboutUs')
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