package com.lms.jpa;

import java.util.Set;

import com.lms.jpa.impl.JPABookIssuedDetailsImpl;

public interface Book {
	
	public long getBookId();
	
	public String getBookName();
	
	public String getAuthor();
	
	public String getSubject();
	
	public int getTotalCopies();
	
	public int getAvailableCopies();
	
	public int getIssuedCopies();
	
	public double getPrice();
	
	public Set<JPABookIssuedDetailsImpl> getIssuedBookDetailSet();

}
