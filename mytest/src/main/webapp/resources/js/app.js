 var app = angular.module('app', []);
 app.config(['$routeProvider',
  function($routeProvider) {
    $routeProvider.
      when('/category', {
		templateUrl: 'resources/pages/category.html',		
	}).
      when('/show', {
		templateUrl: 'pages/show.html',
      }).
      otherwise({
		redirectTo: '/'
      });
}]);
