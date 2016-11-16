package com.mkt.mytest.admin.persist.dao.impl;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.mkt.mytest.admin.persist.dao.CategoryDao;
import com.mkt.mytest.admin.persist.entity.Category;

@Repository("categoryDao")
 
public class CategoryDaoImpl extends GenericHibernateDaoImpl<Category> implements CategoryDao{
   
}
