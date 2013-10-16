package com.lms.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lms.dao.DAOPerson;
import com.lms.jpa.Person;
import com.lms.jpa.impl.JPABookImpl;

import framework.dao.jpa.impl.AbstractGenericDaoImpl;

@Repository
public class DAOPersonImpl extends AbstractGenericDaoImpl<JPABookImpl, Long> implements DAOPerson{
	Logger log = Logger.getLogger(DAOBookImpl.class.getName());

	@PersistenceContext(unitName = "myPersistanceUnit")
	private EntityManager em;

	@Test
	@Override
	public boolean personExist(long personId) {
		if (isExist(personId))
			return true;
		else
			return false;
	}

	@Test
	@Transactional(value = "transactionManager", readOnly = false)
	@Override
	public void insertPerson(Person person) {
		// TODO Auto-generated method stub
		
	}

	@Test
	@Transactional(value = "transactionManager", readOnly = false)
	@Override
	public void updatePerson(Person person) {
		// TODO Auto-generated method stub
		
	}

	@Test
	@Transactional(value = "transactionManager", readOnly = false)
	@Override
	public void deletePerson(long personId) {
		// TODO Auto-generated method stub
		
	}

	@Test
	@Transactional(value = "transactionManager", readOnly = false)
	@Override
	public Person fetchPersonInfo(long personId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Test
	@Transactional(value = "transactionManager", readOnly = false)
	@Override
	public List<Person> fetchAllPerson() {
		// TODO Auto-generated method stub
		return null;
	}

}
