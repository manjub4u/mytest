package com.mkt.mytest.base;

import java.lang.reflect.ParameterizedType;
import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class AbstractHibernateDao<T extends PersistenceEntity> {
	
	static Logger log = Logger.getLogger(AbstractHibernateDao.class.getName());
	
	private Class<T> persistentClass;

	@SuppressWarnings("unchecked")
	public AbstractHibernateDao() {
		this.persistentClass = (Class<T>) ((ParameterizedType) getClass()
				.getGenericSuperclass()).getActualTypeArguments()[0];
	}

	
	SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	@Autowired
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@SuppressWarnings("unchecked")
	public final void setClazz(Class<T> clazzToSet) {
		this.persistentClass = (Class<T>) ((ParameterizedType) getClass()
				.getGenericSuperclass()).getActualTypeArguments()[0];
	}

	@SuppressWarnings("unchecked")
	public T getById(long entityId) {
		return (T) getCurrentSession().get(persistentClass, entityId);
	}

	@SuppressWarnings("unchecked")
	public List<T> findAll() {
		return getCurrentSession().createQuery(
				"from " + persistentClass.getName()).list();
	}

	public void persist(T entity) {
		getCurrentSession().persist(entity);
		log.debug(persistentClass.getSimpleName() + " is persist with id");
	}

	public long save(T entity) {
		long id = (long) getCurrentSession().save(entity);
		log.debug(persistentClass.getSimpleName() + " is save with id:" + id);
		return id;
	}

	public void update(T entity) {
		getCurrentSession().update(entity);
	}

	public void delete(T entity) {
		getCurrentSession().delete(entity);
		getCurrentSession().flush();
	}

	public void deleteById(long entityId) {
		T entity = loadEntity(entityId);
		delete(entity);
		log.debug(persistentClass.getSimpleName() + " is deleted from database");
	}
	
	@SuppressWarnings("unchecked")
	public T loadEntity(long entityId) {
		return (T) sessionFactory.getCurrentSession().load(persistentClass,
				entityId);
	}

	protected final Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}
}
