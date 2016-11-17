
app.factory('Category', ['$resource', function ($resource) {
    //$resource() function returns an object of resource class
    return $resource(
            'http://localhost:8080/mytest/admin/categorys/:id', 
            {id: '@id'},
            {
                update: {
                      method: 'PUT' // To send the HTTP Put request when calling this custom update method.
                }
                 
            }
    );
}]);



app.service('userService', function(){
	 this.mul = function(a) {
	 return a + a
	 };
});