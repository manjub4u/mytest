package com.mkt.mytest.admin.persist.dao;

import java.io.Serializable;
import java.util.List;

public interface GenericDao<T extends Serializable> {
	 
	  T getById(final long id);

	   List<T> findAll();

	   long save(final T entity);

	   void update(final T entity);

	   void delete(final T entity);

	   void deleteById(final long entityId);
}
