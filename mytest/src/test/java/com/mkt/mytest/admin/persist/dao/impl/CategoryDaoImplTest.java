package com.mkt.mytest.admin.persist.dao.impl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.mkt.mytest.admin.persist.entity.Category;
import com.mkt.mytest.config.HibernateConfiguration;

@RunWith(SpringJUnit4ClassRunner.class) 
@ContextConfiguration(classes={HibernateConfiguration.class})
public class CategoryDaoImplTest {
	 @Autowired
	 private CategoryDaoImpl categoryDao;
	
	@Transactional
	@Test	
	public void testSaveCategory(){
		Category category=TestUtil.getCategory("Food-manju", "Here you will get all king of food", "hhttp//:Url", 
				true, 1, 1, new Date(), new Date());
		long id=categoryDao.save(category);
		assertTrue(id>0);
		//categoryDao.deleteById(id);
		}
	
	 @Transactional
	 @Test
	 public void testDeleteByIdCategory(){
		 Category category=TestUtil.getCategory("Food", "Here you will get all king of food", "hhttp//:Url", 
					true, 1, 1, new Date(), new Date());
			long id=categoryDao.save(category);
			categoryDao.deleteById(id);
			assertNull(categoryDao.getById(id));
	 }
	
	 @Transactional
	 @Test
	 public void testDeleteCategory(){
		 Category category=TestUtil.getCategory("Food", "Here you will get all king of food", "hhttp//:Url", 
					true, 1, 1, new Date(), new Date());
			long id=categoryDao.save(category);
			Category categoryFromDb=categoryDao.getById(id);
			categoryDao.delete(categoryFromDb);
			assertNull(categoryDao.getById(id));
	 }
	 
	 @Transactional
	 @Test
	 public void testGetByIdCategory(){
		 Category category=TestUtil.getCategory("Food", "Here you will get all king of food", "hhttp//:Url", 
					true, 1, 1, new Date(), new Date());
			long id=categoryDao.save(category);
			Category categoryFromDb=categoryDao.getById(id);
			assertEquals(category.getName(),categoryFromDb.getName());
			assertEquals(category.getCreatedOn(),categoryFromDb.getCreatedOn());
			categoryDao.deleteById(id);
	 }
	 
	 @Transactional
	 @Test
	 public void testUpdateCategory(){
		 Category category=TestUtil.getCategory("Food", "Here you will get all king of food", "hhttp//:Url", 
					true, 1, 1, new Date(), new Date());
			long id=categoryDao.save(category);
			Category categoryFromDb=categoryDao.getById(id);
			
			//Updating category name
			categoryFromDb.setName("food-2");
			categoryDao.update(categoryFromDb);
			Category updatedEntity=categoryDao.getById(id);
			
			assertEquals (category.getName(),updatedEntity.getName());
			categoryDao.delete(updatedEntity);
	 }
	 
	 @Transactional
	 @Test
	 public void testFindAll(){
		 Category category=TestUtil.getCategory("Food", "Here you will get all king of food", "hhttp//:Url", 
					true, 1, 1, new Date(), new Date());
			long id=categoryDao.save(category);
			List<Category> categorys=categoryDao.findAll();
			assertTrue(categorys.size()>1);
			categoryDao.deleteById(id);
	 }
}
