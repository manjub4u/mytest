 app.controller('myController', function ($scope,userService,Category) {
	 $scope.categorys=[];     
	 $scope.categorys =Category.get();
	 
$scope.add=function(){
 $scope.message = userService.mul(2); 
              }	

$scope.getCategory=function()
{
	
   $scope.catObj = Category.get({id:24},
   function() {
   console.log('User name is ');
   },
   function(){
   alert("Hello! I am an alert box!!");
   console.log('User could not came');
   }
   ); 
   
   $scope.something={
			  "data": [
			    {
			      "pkId": 24,
			      "createdBy": 1,
			      "createdOn": 1478952315000,
			      "lastModifiedOn": 1479231441000,
			      "name": "Food is updated",
			      "description": "Here you will get all king of food",
			      "imgUrl": "hhttp//:Url",
			      "active": true,
			      "lastModifiedBy": 1
			    }
			  ],
			  "self": "Get:mytest/admin/categorys/24"
    }
	
}

$scope.getAllCategory=function()
{
 }
$scope.saveCategory=function()
{
 }
$scope.updateCategory=function()
{
 }

$scope.deleteCategory=function()
{
 }
        });
