package framework.dao.jpa.impl;

import java.io.Serializable;

import javax.persistence.EntityManager;

import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import framework.dao.jpa.MyAbstractDao;


@NoRepositoryBean
public class MyAbstractDaoImpl<T, ID extends Serializable> extends SimpleJpaRepository<T, ID> 
implements MyAbstractDao<T, ID>{

	private EntityManager em;

	public MyAbstractDaoImpl(Class<T> domainClass, EntityManager em) {
		super(domainClass, em);
	    // This is the recommended method for accessing inherited class dependencies.
	    this.em = em;
	}

	
	
	
	
}
