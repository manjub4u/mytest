 app.controller('myController', function ($scope,userService) {
           

$scope.add=function(){
 $scope.message = userService.mul(2); 
              }			
        });
