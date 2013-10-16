/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lms.service.impl;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lms.dao.DAOBook;
import com.lms.dao.DAOFaculty;
import com.lms.dao.DAOStudent;
import com.lms.jpa.Book;
import com.lms.jpa.Faculty;
import com.lms.jpa.Person;
import com.lms.jpa.Student;
import com.lms.service.LibrarianService;

/**
 *
 * @author deepshah
 */
@Service
public class LibrarianServiceImpl implements LibrarianService{
        
    @Autowired
    private DAOBook bookDAO;

    @Autowired      
    private DAOStudent studentDAO;

    @Autowired
    private DAOFaculty facultyDAO;

	@Override
	public void addBook(Book newBook) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateBook(Book updatingBook) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteBook(Book deletingbook) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addStudent(Student newStudent) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateStudent(Student updatingStudent) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteStudent(Student deletingStudent) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addFaculty(Faculty newFaculty) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateFaculty(Faculty updatingFaculty) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteFaculty(Faculty deletingFaculty) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void issueBook(Book book, Person toPerson) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void returnedBook(Book book, Person fromPerson) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double getFineRupees(Person ofPerson) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void collectFine(Person fromPerson) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Set<Book> searchBook(Book book) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean checkBookAvailability(Book book) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int countTotalBooks() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isPaymentDone(Person ofPerson) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Set<Person> getUnpaidPerson() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void blockMember(Person person) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void unblockPerson(Person person) {
		// TODO Auto-generated method stub
		
	}
    
   
    
    
    
}
