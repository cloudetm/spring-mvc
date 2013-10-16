/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package framework.dao.jpa.impl;


import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.apache.log4j.Logger;
import org.springframework.dao.DataAccessException;
import org.springframework.data.repository.Repository;

import framework.dao.jpa.AbstractGenericDao;


/**
 * 
 * @author deepshah
 */
public abstract class AbstractGenericDaoImpl<T, ID extends Serializable> 
		implements AbstractGenericDao<T, ID> {
	static Logger log = Logger.getLogger(AbstractGenericDaoImpl.class.getName());
	// private static final Logger logger =
	// Logger.getLogger(AbstractGenericDaoImpl.class);

	@PersistenceContext(unitName = "myPersistanceUnit")
	protected EntityManager em;

	private Class<T> entityClass;

	@SuppressWarnings("unchecked")
	public AbstractGenericDaoImpl() {
		this.entityClass = (Class<T>) ((ParameterizedType) getClass()
				.getGenericSuperclass()).getActualTypeArguments()[0];
	}

	/* Getter and Setter Methods ---------------- --------------- ---------------- */

	public Class<T> getEntityClass() {
		return entityClass;
	}

	public EntityManager getEm() {
		return em;
	}

	public void setEm(EntityManager em) {
		this.em = em;
	}

	public void setEntityClass(Class<T> entityClass) {
		this.entityClass = entityClass;
	}

	public static String getClassName(String FQClassName) {
	    int firstChar;
	    firstChar = FQClassName.lastIndexOf ('.') + 1;
	    if ( firstChar > 0 ) {
	      FQClassName = FQClassName.substring ( firstChar );
	      }
	    return FQClassName;
	    }
	
	/* Insert Methods --------------- ---------------- ---------------- */

	@Override
	public T insertEntity(final T entity) {
		if (entity == null) {
			return null;
		}
		this.em.persist(entity);
		return (T) entity;
	}


//	@Override
//	public List<T> insertSomeEntities(List<T> list) throws DataAccessException {
//		List<T> resultList = new ArrayList<T>();
//		for (T entity : list) {
//			 resultList.add(this.insertEntity(entity));
//		}
//		if(!resultList.isEmpty()){
//		return resultList;
//		}
//		return null;
//	}

	/* Update Methods --------------- ---------------- ---------------- */

	@Override
	public T updateEntity(final T entity) {
		if (entity == null) {
			return null;
		}
		return (T) this.em.merge(entity);
	}

	/* Delete Methods --------------- ---------------- ---------------- */

	@Override
	public void deleteById(final Long id) {
		if (id != null) {
			T mergedEntity = this.em.merge(this.em.getReference(getEntityClass(), id));
			if (mergedEntity != null) {
				this.em.remove(this.em.merge(this.em.getReference(getEntityClass(), id)));
			}
		}
	}

	@Override
	public void deleteByEntity(final T entity) {
		if (entity != null) {
			T mergedEntity = (T)this.em.merge(entity);
			if (mergedEntity != null) {
				this.em.remove(mergedEntity);
			}
		}
	}


	public void deleteSomeEntity(List<T> listOfEntity)  {
		if (listOfEntity.size() > 0) {
			for (T eachEntity : listOfEntity) {
				this.deleteByEntity(eachEntity);
			}
		}
	}

	@Override
	public void clearTable() {
		String querString = "DELETE FROM "+getClassName(getEntityClass().getName());
		Query query=em.createQuery(querString);
		int deleteRecords=query.executeUpdate();
	}
	      
	/* Find Methods --------------- ---------------- ---------------- */

	@Override
	public T findOneById(final Object id) {
		if (id == null) {
			return null;
		}
		try {
			T entity = (T) this.em.find(getEntityClass(), id);
			return entity;
		} catch (java.lang.NullPointerException npe) {
			return null;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<T> findByNamedQuery(final String name, Object[] params) {

		Query query = em.createNamedQuery(name);
		for (int i = 0; i < params.length; i++) {
			query.setParameter(i + 1, params[i]);
		}
		final List<T> result = (List<T>) query.getResultList();
		return result;
	}
  
	@SuppressWarnings("unchecked")
	@Override
	public List<T> findAll() throws DataAccessException {
		String querString = "SELECT p FROM "+getClassName(getEntityClass().getName() +" p");
		List<T> resultList = em.createQuery(querString).getResultList();
		return resultList;
	}
	
	/* Entity Exist's or NotMethods --------------- ---------------- ---------------- */

	@Override
	public boolean isExist(final Long id) {
		if ((Long) id == null) {
			return false;
		} else {
			T entity = this.em.find(getEntityClass(), id);
			if (entity != null)
				return true;
		}
		return false;
	}

	public boolean contains(T object) {
		return this.em.contains(object); 
		}
	
	/* Execute JPQLQuery's Methods --------------- ---------------- ---------------- */
	
	@SuppressWarnings("unchecked")
	public List<T> executeJpqlQuery(String jpqlQuery)
			throws DataAccessException {
		return this.em.createQuery(jpqlQuery).getResultList();
	}

}