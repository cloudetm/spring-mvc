/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lms.dao.impl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lms.dao.DAOLibrarian;
import com.lms.jpa.Librarian;
import com.lms.jpa.impl.JPALibrarianImpl;
import com.lms.repositories.LibrarianRepository;

import framework.dao.jpa.impl.AbstractGenericDaoImpl;
import framework.dao.jpa.repositories.CrudBaseRepository;

/**
 * 
 * @author deepshah
 */
@Repository
public class DAOLibrarianImpl extends
		AbstractGenericDaoImpl<JPALibrarianImpl, Long> implements DAOLibrarian {

	Logger log = Logger.getLogger(DAOBookImpl.class.getName());

	@PersistenceContext(unitName = "myPersistanceUnit")
	private EntityManager em;
	
	@Autowired
	private LibrarianRepository librarianRepo;
	
	@Override
	public boolean librarianExist(long librarianId) {
		if (isExist(librarianId))
			return true;
		else
			return false;
	}

	@Transactional(value = "transactionManager")
	@Override
	public void insertLibrarian(Librarian librarian) {
		long librarianId = librarian.getLibrarianId();
		if (!isExist(librarianId)) {
			try {
				insertEntity((JPALibrarianImpl) librarian);
			} catch (IllegalArgumentException e) {
				log.debug("Error that id already inserted" + e);
			}
		}
	}

	@Transactional(value = "transactionManager")
	@Override
	public void updateLibrarian(Librarian librarian) {
		long librarianId = librarian.getLibrarianId();
		if (isExist(librarianId)) {
			Librarian newLibrarian = updateEntity((JPALibrarianImpl) librarian);
		}
	}

	@Transactional(value = "transactionManager")
	@Override
	public void deleteLibrarian(long librarianId) {
		if (isExist(librarianId)) {
			try {
				deleteById(librarianId);
			} catch (IllegalArgumentException e) {
				log.debug("Error that id already delted" + e);
			}

		}
	}

	@Override
	@Transactional(value = "transactionManager")
	public Librarian fetchLibrarianInfo(long librarianId) {

	return findOneById(librarianId);
	
	
	}

	@Override
	@Transactional(value = "transactionManager")
	public List<Librarian> fetchAllLibrarians() {
		List<JPALibrarianImpl> requestedLibrarians = null;
		List<Librarian> resultSet = new ArrayList<Librarian>();
		requestedLibrarians = findAll();
		for (JPALibrarianImpl jpaLibrarianImpl : requestedLibrarians) {
			resultSet.add((Librarian) jpaLibrarianImpl);
		}
		if (!resultSet.isEmpty()) {
			return resultSet;
		}
		return null;
	}

	@Transactional(value = "transactionManager")
	@Override
	public void clearLibrariansTable() {
		clearTable();

	}
}
