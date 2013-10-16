package com.lms.service;

import java.util.Set;

import org.springframework.data.repository.Repository;

import com.lms.jpa.Book;
import com.lms.jpa.Faculty;
import com.lms.jpa.Librarian;
import com.lms.jpa.Person;
import com.lms.jpa.Student;


public interface LibrarianService  {
	
	public void addBook(Book newBook);
	
	public void updateBook(Book updatingBook);
	
	public void deleteBook(Book deletingbook);
	
	public void addStudent(Student newStudent);
	
	public void updateStudent(Student updatingStudent);
	
	public void deleteStudent(Student deletingStudent);
	
	public void addFaculty(Faculty newFaculty);
	
	public void updateFaculty(Faculty updatingFaculty);
	
	public void deleteFaculty(Faculty deletingFaculty);
	
	public void issueBook(Book book,Person toPerson);
	
	public void returnedBook(Book book,Person fromPerson);
	
	public double getFineRupees(Person ofPerson);
	
	public void collectFine(Person fromPerson);
	
	public Set<Book> searchBook(Book book);
	
	public  boolean checkBookAvailability(Book book);
	
	public int countTotalBooks();
	
	public boolean isPaymentDone(Person ofPerson);
	
	public Set<Person> getUnpaidPerson();
	
	public void blockMember(Person person);
	
	public void unblockPerson(Person person);

}
