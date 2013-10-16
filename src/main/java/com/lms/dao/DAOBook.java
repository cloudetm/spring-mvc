package com.lms.dao;

import com.lms.jpa.Book;

import java.util.List;
public interface DAOBook {

	public boolean bookExist(long bookId);
	
	public void insertBook(Book book);

	public void updateBook(Book book);
	
	public void deleteBook(long bookId);
	
	public Book fetchBookInfo(long bookId);
	
	public List<Book> fetchAllBooks();
	
	public void test(List<Book> a);
	
	public void clearBooksTable();
      
}
