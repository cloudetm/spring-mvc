package com.lms.jpa.impl;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.lms.jpa.Book;

@Entity
@Table(name="BOOKS")
@NamedQueries({
	@NamedQuery(name="fetchAllBooksQuery",
		query="SELECT b FROM JPABookImpl b")
//	, 
//	@NamedQuery(name="deleteBookByIdQuery",
//		query="DELETE b FROM JPABookImpl b WHERE b.bookId =:bookId")	
})

public class JPABookImpl implements Book{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="BOOK_ID")
	private long bookId;
	
	@Column(name="BOOK_NAME")
	private String bookName;
	
	@Column(name="AUTHOR")
	private String author;
	
	@Column(name="SUBJECT")
	private String subject;
	
	@Column(name="TOTAL_COPIES")
	private int totalCopies;
	
	@Column(name="AVAILABLE_COPIES")
	private int availableCopies;
	
	@Column(name="ISSUED_COPIES")
	private int issuedCopies;
	
	@Column(name="PRICE")
	private double price;
	
	@OneToMany(mappedBy="book", targetEntity = JPABookIssuedDetailsImpl.class)
	Set<JPABookIssuedDetailsImpl> issuedBookDetailSet;

	public long getBookId() {
		return bookId;
	}

	public void setBookId(long bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public int getTotalCopies() {
		return totalCopies;
	}

	public void setTotalCopies(int totalCopies) {
		this.totalCopies = totalCopies;
	}

	public int getAvailableCopies() {
		return availableCopies;
	}

	public void setAvailableCopies(int availableCopies) {
		this.availableCopies = availableCopies;
	}

	public int getIssuedCopies() {
		return issuedCopies;
	}

	public void setIssuedCopies(int issuedCopies) {
		this.issuedCopies = issuedCopies;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Set<JPABookIssuedDetailsImpl> getIssuedBookDetailSet() {
		return issuedBookDetailSet;
	}

	public void setIssuedBookDetailSet(
			Set<JPABookIssuedDetailsImpl> issuedBookDetailSet) {
		this.issuedBookDetailSet = issuedBookDetailSet;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (bookId ^ (bookId >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		JPABookImpl other = (JPABookImpl) obj;
		if (bookId != other.bookId)
			return false;
		return true;
	}

	/**
	 * @param bookId
	 * @param bookName
	 * @param author
	 * @param subject
	 * @param totalCopies
	 * @param availableCopies
	 * @param issuedCopies
	 * @param price
	 */
	public JPABookImpl(long bookId, String bookName, String author,
			String subject, int totalCopies, int availableCopies,
			int issuedCopies, double price) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.author = author;
		this.subject = subject;
		this.totalCopies = totalCopies;
		this.availableCopies = availableCopies;
		this.issuedCopies = issuedCopies;
		this.price = price;
	}
	
	public JPABookImpl(){}
	

	
}
