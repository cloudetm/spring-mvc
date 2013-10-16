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

import com.lms.dao.DAOBook;
import com.lms.jpa.Book;
import com.lms.jpa.impl.JPABookImpl;

import framework.dao.jpa.impl.AbstractGenericDaoImpl;

//import org.apache.log4j.Logger;

/**
 * 
 * @author deepshah
 */
@Repository
public class DAOBookImpl extends AbstractGenericDaoImpl<JPABookImpl, Long>
		implements DAOBook {

	Logger log = Logger.getLogger(DAOBookImpl.class.getName());

	@PersistenceContext(unitName = "myPersistanceUnit")
	private EntityManager em;

	@Test
	@Override
	public boolean bookExist(long bookId) {
		if (isExist(bookId))
			return true;
		else
			return false;
	}

	@Test
	@Transactional(value = "transactionManager", readOnly = false)
	@Override
	public void insertBook(Book book) {
		long bookId = book.getBookId();

		if (!isExist(bookId)) {
			insertEntity((JPABookImpl) book);
		}
	}

	@Test
	@Transactional(value = "transactionManager", readOnly = false)
	@Override
	public void deleteBook(long bookId) {
		if (isExist(bookId)) {
			try {
				deleteById(bookId);
			} catch (IllegalArgumentException e) {
				// log.debug("Error that id already delted" + e);
			}
			// log.debug("***************** : "+delete);
		}
	}

	@Test
	@Transactional(value = "transactionManager", readOnly = false)
	@Override
	public void updateBook(Book book) {
		long bookId = book.getBookId();
		if (isExist(bookId)) {
			Book newBook = updateEntity((JPABookImpl) book);
		}
	}

	@Test
	@Override
	public Book fetchBookInfo(long bookId) {
		Book book = null;
		if (isExist(bookId)) {
		//	book = findOneById(bookId);
		}
		return book;
	}

	@Test
	@Override
	public List<Book> fetchAllBooks() {
		// List<JPABook> requestedBooks =
		// em.createNamedQuery("fetchAllBooksQuery",
		// JPABook.class).getResultList();
		List<JPABookImpl> requestedBooks = null;
		List<Book> resultSet = new ArrayList<Book>();
		requestedBooks = findAll();
		for (JPABookImpl jpaBookImpl : requestedBooks) {
			resultSet.add((Book) jpaBookImpl);
		}
		if (!resultSet.isEmpty()) {
			return resultSet;
		}
		return null;
	}

	@Test
	@Transactional(value = "transactionManager", readOnly = false)
	@Override
	public void test(List<Book> a) {

		/* Line to deleting by Entity */

		// deleteByEntity((JPABookImpl) jpaBook);

		/* Code for deleting whole List of Entity */

		// List<JPABookImpl> requestedBooks = new ArrayList<JPABookImpl>();
		// List<JPABook> resultSet = new ArrayList<JPABook>();
		// for (JPABook jpaBook : a) {
		// requestedBooks.add((JPABookImpl)jpaBook);
		// }
		// deleteSomeEntity(requestedBooks);

		/* Code for clear whole table contents */
		// clearTable();
	}
	
	@Transactional(value = "transactionManager", readOnly = false)
	@Override
	public void clearBooksTable() {
		clearTable();
	}

}