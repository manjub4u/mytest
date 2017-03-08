/**
* The HelloWorld program implements an application that
* simply displays "Hello World!" to the standard output.
*
* @author  mkt
* @version 1.0
* @since   06-11-2016 
*/
package com.mkt.mytest.admin.service.impl;

import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mkt.mytest.admin.persist.dao.CategoryDao;
import com.mkt.mytest.admin.persist.entity.Category;
import com.mkt.mytest.admin.service.CategoryService;
import com.mkt.mytest.base.BaseUtil;

@Service("categoryService")
@Transactional
public class CategoryServiceImpl implements CategoryService{
    
	
	CategoryDao categoryDao;
    
	public CategoryDao getCategoryDao() {
		return categoryDao;
	}
	
	@Autowired
	public void setCategoryDao(CategoryDao categoryDao) {
		this.categoryDao = categoryDao;
	}

	@Override
	public long saveCategory(Category category) {
			Date date = new Date();
			if(category.getCreatedOn()==null){
			category.setCreatedBy(BaseUtil.getUser().getId());
			category.setLastModifiedBy(BaseUtil.getUser().getId());
		} else {
			category.setLastModifiedBy(BaseUtil.getUser().getId());
		}
		return categoryDao.save(category);
	}
    
	@Override
	public void updateCategory(Category category) {
		categoryDao.update(category);
		category.setLastModifiedBy(BaseUtil.getUser().getId());
	}
    
	@Override
	public void deleteCategory(long id) {
		 categoryDao.deleteById(id);
	}
    
	@Override
	public List<Category> getAllCategory() {
		return categoryDao.findAll();
	}
    
	@Override
	public Category getCategoryById(long id) {
		return categoryDao.getById(id);
	}

	
}
