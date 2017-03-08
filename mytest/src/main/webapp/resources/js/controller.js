 app.controller('myController', function ($scope,userService,Category) {
	 $scope.categorySaved=null;
	 $scope.showErrors=false;
	
	 $scope.getAllCategory=function()
		{
			$scope.categorys = Category.get(
			 function() {
				 //success
				 console.log('Category came');
				 },
			 function(){
					 //error
					 console.log('getAllCategory method if faild'); }
				 );
		 }
	 
	 	//geting all category from database
	   $scope.getAllCategory();
	  
	   $scope.openModal=function(){
		   $scope.category={};
		   $('#myModal').modal().show();
	   }
	   
		$scope.getCategoryById=function()
		{
			
		}
		
		$scope.saveCategory=function()
		{		$scope.showErrors=false;
			    $scope.obj=Category.save($scope.category,function(){ 
			    $scope.category={}
				$scope.categorySaved=$scope.obj.info.message;
			    console.log($scope.obj.info.message);
			      
		},function(httpResponse){
			     $scope.showErrors=true;
		         $scope.errorMgs=httpResponse.data;
			     console.log($scope.errorMgs.errors);
				 $scope.errors=$scope.errorMgs.errors; });
		 }
		
		//update  Category
		$scope.updateCategory=function(){
			$scope.showErrors=false;
		    $scope.obj=Category.update($scope.category,function(){ 
		    	$scope.category={};
		    	$('#myModal').modal('hide');
		    	alert("Category update succefully");
	},function(httpResponse){
		     $scope.showErrors=true;
	         $scope.errorMgs=httpResponse.data;
		     console.log($scope.errorMgs.errors);
			 $scope.errors=$scope.errorMgs.errors; });
		}

		$scope.edit=function(category)
		{
		
			$('#myModal').modal().show();
			$scope.category=category;
			console.log(category);
		 }
		
		$scope.saveOrUpdateCategory=function(id){
			if(id==null){
				$scope.saveCategory();
			}else{
				$scope.updateCategory();
			}
		}
		
		$scope.deleteCategory=function(pkId)
		{
			alert(pkId);
			console.log('Deleting user with id ', pkId);
			 var user = Category.get({id:pkId}, function() {
                 user.$delete(function(){
                     console.log('Deleting user with id ', pkId);
                 });
            });
		 }
		
        });
 

	 
 
