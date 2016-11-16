package com.mkt.mytest.base;

import org.apache.log4j.Logger;

import com.mkt.mytest.admin.persist.entity.User;


public class BaseUtil {
	static Logger log = Logger.getLogger(BaseUtil.class.getName());
	public static	User getUser(){
		User user=new User();
		user.setActive(true);
		user.setFirstName("manju");
		user.setId(1);
		return user;
	}

	static void setAuditColumns(PersistenceEntity entity) throws ClassNotFoundException {
		
		/*if (entity.getCreatedOn() == null) {
			Date date = new Date();
			((entity.getClazz()) entity).setCreatedOn(date);
			entity.setLastModifiedOn(date);
			entity.setCreatedBy(getUser().getId());
			entity.setLastModifiedBy(getUser().getId());
		} else {
			entity.setLastModifiedOn(new Date());
			entity.setLastModifiedBy(getUser().getId());
		}*/
		//log.debug("Audit logs added for PersistenceEntity:"+ entity.getClassName());
	}
}
