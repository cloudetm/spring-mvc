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
import org.junit.Test;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lms.dao.DAOFaculty;
import com.lms.jpa.Faculty;
import com.lms.jpa.impl.JPAFacultyImpl;

import framework.dao.jpa.impl.AbstractGenericDaoImpl;

/**
 *
 * @author deepshah
 */
@Repository
public class DAOFacultyImpl extends AbstractGenericDaoImpl<JPAFacultyImpl,Long> implements DAOFaculty{

	Logger log = Logger.getLogger(DAOBookImpl.class.getName());


	@PersistenceContext(unitName = "myPersistanceUnit")
	private EntityManager em;

	@Test
    @Override
    public boolean facultyExist(long facultyId) {
    	if (isExist(facultyId))
			return true;
		else
			return false;
    }
 
	@Test
	@Transactional(value = "transactionManager", readOnly = false)
    @Override
    public void insertFaculty(Faculty faculty) {
		long facultyId= faculty.getFacultyId();
		if (!isExist(facultyId)) {
			try {
			insertEntity((JPAFacultyImpl) faculty);
			} catch (IllegalArgumentException e) {
				 log.debug("Error that id already inserted" + e);
			}
		}
    }

	@Test
	@Transactional(value = "transactionManager", readOnly = false)
    @Override
    public void updateFaculty(Faculty faculty) {
		long facultyId = faculty.getFacultyId();
		if (isExist(facultyId)) {
			Faculty newFaculty = updateEntity((JPAFacultyImpl) faculty);
		}
    }

	@Test
	@Transactional(value = "transactionManager", readOnly = false)
    @Override
    public void deleteFaculty(long facultyId) {
    	if (isExist(facultyId)) {
			try {
				deleteById(facultyId);
			} catch (IllegalArgumentException e) {
				 log.debug("Error that id already delted" + e);
			}
			
		}
    }

	@Test
    @Override
    public Faculty fetchFacultyInfo(long facultyId) {
		Faculty faculty = null;
		if (isExist(facultyId)) {
	//		faculty = findOneById(facultyId);
		}
		return faculty;
    }
	
	@Test
    @Override
    public List<Faculty> fetchAllFaculties() {
		List<JPAFacultyImpl> requestedFaculties = null;
		List<Faculty> resultSet = new ArrayList<Faculty>();
		requestedFaculties = findAll();
		for (JPAFacultyImpl jpaFacultyImpl : requestedFaculties) {
			resultSet.add((Faculty) jpaFacultyImpl);
		}
		if (!resultSet.isEmpty()) {
			return resultSet;
		}
		return null;
    }
	
	@Transactional(value = "transactionManager", readOnly = false)
	@Override
	public void clearFacultiesTable() {
		clearTable();
		
	}
   
    
}
