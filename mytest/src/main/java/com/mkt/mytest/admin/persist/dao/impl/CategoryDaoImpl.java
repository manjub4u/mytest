package com.mkt.mytest.admin.persist.dao.impl;

import org.springframework.stereotype.Repository;

import com.mkt.mytest.admin.persist.dao.CategoryDao;
import com.mkt.mytest.admin.persist.entity.Category;
import com.mkt.mytest.base.AbstractHibernateDao;

@Repository("categoryDao")
public class CategoryDaoImpl extends AbstractHibernateDao  implements CategoryDao{

	@Override
	public Category getById(long id) {
		// TODO Auto-generated method stub
		return getById(id);
	}

	@Override
	public long save(Category entity) {
		return save(entity);
	}

	@Override
	public void update(Category entity) {
	  update(entity);
		
	}

	@Override
	public void delete(Category entity) {
		// TODO Auto-generated method stub
		
	}
   
}
