/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lms.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lms.dao.DAOStudent;
import com.lms.jpa.Student;
import com.lms.jpa.impl.JPAStudentImpl;

import framework.dao.jpa.impl.AbstractGenericDaoImpl;

/**
 * 
 * @author deepshah
 */
@Repository
public class DAOStudentImpl extends
		AbstractGenericDaoImpl<JPAStudentImpl, Long> implements DAOStudent {

	Logger log = Logger.getLogger(DAOBookImpl.class.getName());

	@PersistenceContext(unitName = "myPersistanceUnit")
	private EntityManager em;

	@Test
	@Override
	public boolean studentExist(long studentId) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Test
	@Transactional(value = "transactionManager", readOnly = false)
	@Override
	public void insertStudent(Student student) {

	}

	@Test
	@Transactional(value = "transactionManager", readOnly = false)
	@Override
	public void updateStudent(Student student) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Test
	@Transactional(value = "transactionManager", readOnly = false)
	@Override
	public void deleteStudent(long studentId) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Test
	@Override
	public Student fetchStudentInfo(long studentId) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public List<Student> fetchAllStudents() {
		throw new UnsupportedOperationException("Not supported yet.");
	}
	
	@Transactional(value = "transactionManager", readOnly = false)
	@Override
	public void clearStudentsTable() {
		clearTable();

	}

}
