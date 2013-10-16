package com.lms.jpa.impl;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.lms.jpa.BookIssuedDetails;

@Entity
@Table(name="BOOK_ISSUED_DETAILS")
public class JPABookIssuedDetailsImpl implements BookIssuedDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="TRANSACTION_ID")
	private long transactionId;
	
	@ManyToOne
	@JoinColumn(name="Student_ID_FK")
	private JPAStudentImpl student;
	
	@ManyToOne
	@JoinColumn(name="Faculty_ID_FK")
	private JPAFacultyImpl faculty;
	
	@ManyToOne
	@JoinColumn(name="BOOK_ID_FK")
	private JPABookImpl book;
	
	@Column(name="ISSUED_DATE")
	@Temporal(TemporalType.DATE)
	private Date issuedDate;
	
	@Column(name="DATE_FOR_RETURN")
	@Temporal(TemporalType.DATE)
	private Date dateForBookReturn;
	
	@Column(name="RETURNED_DATE")
	@Temporal(TemporalType.DATE)
	private Date returnDate;
	
	@Column(name="BOOK_ISSUED")
	private boolean isBookIssued;
	
	@Column(name="BOOK_RETURNED")
	private boolean isBookReturned;
	
	@Column(name="FINE_RS")
	private double fineRs;
	
	@Column(name="FINE_TYPE")
	private boolean fineType;

	public long getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(long transactionId) {
		this.transactionId = transactionId;
	}

	

	public JPAStudentImpl getStudent() {
		return student;
	}

	public void setStudent(JPAStudentImpl student) {
		this.student = student;
	}

	public JPAFacultyImpl getFaculty() {
		return faculty;
	}

	public void setFaculty(JPAFacultyImpl faculty) {
		this.faculty = faculty;
	}

	public JPABookImpl getBook() {
		return book;
	}

	public void setBook(JPABookImpl book) {
		this.book = book;
	}

	public Date getIssuedDate() {
		return issuedDate;
	}

	public void setIssuedDate(Date issuedDate) {
		this.issuedDate = issuedDate;
	}

	public Date getDateForBookReturn() {
		return dateForBookReturn;
	}

	public void setDateForBookReturn(Date dateForBookReturn) {
		this.dateForBookReturn = dateForBookReturn;
	}

	public Date getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(Date returnDate) {
		this.returnDate = returnDate;
	}

	public boolean isBookIssued() {
		return isBookIssued;
	}

	public void setBookIssued(boolean isBookIssued) {
		this.isBookIssued = isBookIssued;
	}

	public boolean isBookReturned() {
		return isBookReturned;
	}

	public void setBookReturned(boolean isBookReturned) {
		this.isBookReturned = isBookReturned;
	}

	public double getFineRs() {
		return fineRs;
	}

	public void setFineRs(double fineRs) {
		this.fineRs = fineRs;
	}

	public boolean isFineType() {
		return fineType;
	}

	public void setFineType(boolean fineType) {
		this.fineType = fineType;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ (int) (transactionId ^ (transactionId >>> 32));
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
		JPABookIssuedDetailsImpl other = (JPABookIssuedDetailsImpl) obj;
		if (transactionId != other.transactionId)
			return false;
		return true;
	}
	
	public JPABookIssuedDetailsImpl() {
		// TODO Auto-generated constructor stub
	}
	

}
