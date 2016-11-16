package com.mkt.mytest.admin.persist.dao.impl;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import com.mkt.mytest.config.HibernateConfiguration;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes={HibernateConfiguration.class,CategoryDaoImplTest.class},loader=AnnotationConfigContextLoader.class) 
public class Test {

	@org.junit.Test
	public void test1(){
		System.out.println("hello test");
	}
}
