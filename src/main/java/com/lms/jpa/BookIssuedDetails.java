package com.lms.jpa;

import java.util.Date;

import com.lms.jpa.impl.JPABookImpl;
import com.lms.jpa.impl.JPAFacultyImpl;
import com.lms.jpa.impl.JPAStudentImpl;

public interface BookIssuedDetails {


	public long getTransactionId();
	
	public JPAStudentImpl getStudent();
	
	public JPAFacultyImpl getFaculty();
	
	public JPABookImpl getBook();
	
	public Date getIssuedDate();
	
	public Date getDateForBookReturn();

	public Date getReturnDate();
	
	public boolean isBookIssued();
	
	public boolean isBookReturned();
	
	public double getFineRs();
	
	public boolean isFineType();	

}
