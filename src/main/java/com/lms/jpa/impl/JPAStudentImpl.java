package com.lms.jpa.impl;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.lms.jpa.Student;

@Entity
//@Table(name="PERSON")
//@DiscriminatorValue(value="Student")
@Table(name="STUDENT")
public class JPAStudentImpl implements Student{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="STUDENT_ID")
	private long studentId;
	
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

	@Column(name="DIVISION")
	private char division;

	@Column(name="ENROLLMENT_NO")
	private long enrollmentNo;
	
	@Column(name="BRANCH_NAME")
	private String branchName;
	
	@Column(name="ENROLLMENT_YEAR")
	private Date enrollmentYear;
	
	public long getEnrollmentNo() {
		return enrollmentNo;
	}

	public void setEnrollmentNo(long enrollmentNo) {
		this.enrollmentNo = enrollmentNo;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public Date getEnrollmentYear() {
		return enrollmentYear;
	}

	public void setEnrollmentYear(Date enrollmentYear) {
		this.enrollmentYear = enrollmentYear;
	}

	public long getStudentId() {
		return studentId;
	}

	public void setStudentId(long studentId) {
		this.studentId = studentId;
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

	public char getDivision() {
		return division;
	}

	public void setDivision(char division) {
		this.division = division;
	}

	/**
	 * @param studentId
	 * @param firstName
	 * @param middleName
	 * @param lastName
	 * @param username
	 * @param email
	 * @param password
	 * @param mobileNumber
	 * @param division
	 * @param enrollmentNo
	 * @param branchName
	 * @param enrollmentYear
	 */
	public JPAStudentImpl(long studentId, String firstName, String middleName,
			String lastName, String username, String email, String password,
			String mobileNumber, char division, long enrollmentNo,
			String branchName, Date enrollmentYear) {
		super();
		this.studentId = studentId;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.username = username;
		this.email = email;
		this.password = password;
		this.mobileNumber = mobileNumber;
		this.division = division;
		this.enrollmentNo = enrollmentNo;
		this.branchName = branchName;
		this.enrollmentYear = enrollmentYear;
	}

	public JPAStudentImpl(){}

	
}
