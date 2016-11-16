package com.mkt.mytest.admin.persist.dao.impl;

import com.mkt.mytest.admin.persist.dao.GenericDao;
import com.mkt.mytest.base.AbstractHibernateDao;
import com.mkt.mytest.base.PersistenceEntity;

public class GenericHibernateDaoImpl<T extends PersistenceEntity> extends AbstractHibernateDao< T > implements GenericDao< T > {
  
}
