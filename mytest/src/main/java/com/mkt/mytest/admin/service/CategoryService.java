/**
* The HelloWorld program implements an application that
* simply displays "Hello World!" to the standard output.
*
* @author  mkt
* @version 1.0
* @since   06-11-2016 
*/

package com.mkt.mytest.admin.service;

import java.util.List;

import com.mkt.mytest.admin.persist.entity.Category;

public interface CategoryService {
	long saveCategory(Category category);
	void updateCategory(Category category);
	void deleteCategory(long id);
	List<Category> getAllCategory();
	Category getCategoryById(long id);
}
