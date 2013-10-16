package com.lms.service;

import com.lms.jpa.Book;
import com.lms.jpa.Faculty;
import java.util.Set;


public interface FacultyService {

	public void UpdateFacultyInfo(Faculty ofFaculty);
	
	public Set<Book> SearchBook(Book book);
	
	public boolean isBookAvailabile(Book book);
	
	public void RequestBook(Book requestedBook);
	
	public Set<Book> ViewIssuedBooks(Faculty ofFaculty);
	
	public double CheckPayment(Faculty ofFaculty);
	
	public boolean isPaymentDone(Faculty ofFaculty);

}
