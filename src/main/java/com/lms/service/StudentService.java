package com.lms.service;

import com.lms.jpa.Book;
import com.lms.jpa.Student;
import java.util.Set;

public interface StudentService {
	
	public void UpdateStudentInfo(Student ofStudent);
	
	public Set<Book> SearchBook(Book book);
	
	public boolean isBookAvailabile(Book book);
	
	public void RequestBook(Book requestedBook);
	
	public Set<Book> ViewIssuedBooks(Student ofStudent);
	
	public double CheckPayment(Student ofStudent);
	
	public boolean isPaymentDone(Student ofStudent);
	
}
