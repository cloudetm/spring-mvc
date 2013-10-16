/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lms.service.impl;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lms.dao.DAOBook;
import com.lms.dao.DAOFaculty;
import com.lms.dao.DAOLibrarian;
import com.lms.dao.DAOStudent;
import com.lms.jpa.Librarian;
import com.lms.service.AdminService;

/**
 *
 * @author deepshah
 */
@Service
public class AdminServiceImpl implements AdminService{

	@Autowired
	DAOLibrarian librarianDAO;
	
	@Autowired
	DAOBook bookDAO;
	
	@Autowired
	DAOFaculty facultyDAO;
	
	@Autowired
	DAOStudent studentDAO;
	
	
	@Test
    @Override
    public void addLirbrarian(Librarian newLibrarian) {
    	librarianDAO.insertLibrarian(newLibrarian);
    }

	@Test
    @Override
    public void updateLirbrarian(Librarian updatingLibrarian) {
    	librarianDAO.updateLibrarian(updatingLibrarian);
    }

	@Test
    @Override
    public void deleteLirbrarian(long librarianId) {
    	librarianDAO.deleteLibrarian(librarianId);
    }

	@Test
    @Override
    public boolean checkLibrarian(long librarianId) {
    	boolean result = librarianDAO.librarianExist(librarianId);
    	return result;
    }
	
	@Test
    @Override
    public List<Librarian> getAllLirbrarian() {
          List<Librarian> librariansList = librarianDAO.fetchAllLibrarians();
		return librariansList;
		
    }
	@Test
	@Override
	public Librarian getLirbrarianInfo(long librarianId) {
	Librarian librarian = librarianDAO.fetchLibrarianInfo(librarianId);
	return librarian;
	}

	@Override
	public void DeleteAllLibrarians() {
		librarianDAO.clearLibrariansTable();
	}

	@Override
	public void DeleteAllStudents() {
		studentDAO.clearStudentsTable();
	}

	@Override
	public void DeleteAllBooks() {
		bookDAO.clearBooksTable();
		
	}

	@Override
	public void DeleteAllFaculties() {
		facultyDAO.clearFacultiesTable();
	}
    
}
