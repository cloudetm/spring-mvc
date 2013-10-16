package com.lms.jpa.impl;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.lms.jpa.Faculty;

@Entity
//@Table(name="PERSON")
//@DiscriminatorValue(value="Faculty")
@Table(name="FACULTY")

public class JPAFacultyImpl  implements Faculty {
	

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="FACULTY_ID")
	private long facultyId;
	
	@Column(name="FIRST_NAME")
	private String firstName;
	
	@Column(name="MIDDLE_NAME")
	private String middleName;
	
	@Column(name="LAST_NAME")
	private String lastName;
	
	@Column(name="USER_NAME")
	private String username;
	
	@Column(name="EMAIL")
	private String email;
	
	@Column(name="PASSWORD")
	private String password;
	
	@Column(name="MOBILE_NUMBER")
	private String mobileNumber;

	@Column(name="FACULTY_DEPARTMENT")
	private String facultyDepartment;

	
	public long getFacultyId() {
		return facultyId;
	}

	public void setFacultyId(long facultyId) {
		this.facultyId = facultyId;
	}

	public String getFacultyDepartment() {
		return facultyDepartment;
	}

	public void setFacultyDepartment(String facultyDepartment) {
		this.facultyDepartment = facultyDepartment;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (facultyId ^ (facultyId >>> 32));
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
		JPAFacultyImpl other = (JPAFacultyImpl) obj;
		if (facultyId != other.facultyId)
			return false;
		return true;
	}

	/**
	 * @param facultyId
	 * @param firstName
	 * @param middleName
	 * @param lastName
	 * @param username
	 * @param email
	 * @param password
	 * @param mobileNumber
	 * @param facultyDepartment
	 */
	public JPAFacultyImpl(long facultyId, String firstName, String middleName,
			String lastName, String username, String email, String password,
			String mobileNumber,String facultyDepartment) {
		super();
		this.facultyId = facultyId;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.username = username;
		this.email = email;
		this.password = password;
		this.mobileNumber = mobileNumber;
		this.facultyDepartment = facultyDepartment;
	}
	public JPAFacultyImpl(){}
	

	
	
	
}
