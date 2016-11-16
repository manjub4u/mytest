package com.mkt.mytest.admin.persist.dao.impl;

import java.util.Date;

import com.mkt.mytest.admin.persist.entity.Category;

public class TestUtil {

	public static Category getCategory(String name, String description, String imgUrl,
			boolean isActive, long lastModifiedBy, long createdBy,
			Date createdOn, Date lastModifiedOn) {
			Category category=new Category();
			category.setName(name);
			category.setDescription(description); 
			category.setActive(isActive);
			category.setCreatedBy(createdBy);
			//category.setCreatedOn(createdOn);
			category.setImgUrl(imgUrl);
			category.setLastModifiedBy(lastModifiedBy);	
			//category.setLastModifiedOn(lastModifiedOn);
			return category;
			
	}
}
