package com.lms.jpa.impl;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.lms.jpa.Librarian;

@Entity
@Table(name="LIBRARIAN")
public class JPALibrarianImpl implements Librarian {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="LIBRARIAN_ID")
	private long librarianId;
	
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
	
	@Column(name="PROFILE_PICTURE")
	private String profilePicture;
	
	@Transient
	private CommonsMultipartFile profilePic;

	public long getLibrarianId() {
		return librarianId;
	}

	public void setLibrarianId(long librarianId) {
		this.librarianId = librarianId;
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
	
	public String getProfilePicture() {
		return profilePicture;
	}

	public void setProfilePicture(String profilePicture) {
		this.profilePicture = profilePicture;
	}
	
	public CommonsMultipartFile getProfilePic() {
		return profilePic;
	}

	public void setProfilePic(CommonsMultipartFile profilePic) {
		this.profilePic = profilePic;
	}

		@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + (int) (librarianId ^ (librarianId >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		JPALibrarianImpl other = (JPALibrarianImpl) obj;
		if (librarianId != other.librarianId)
			return false;
		return true;
	}

	
	public JPALibrarianImpl(long librarianId, String firstName,
			String middleName, String lastName, String username, String email,
			String password, String mobileNumber, String profilePicture) {
		super();
		this.librarianId = librarianId;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.username = username;
		this.email = email;
		this.password = password;
		this.mobileNumber = mobileNumber;
		this.profilePicture = profilePicture;
	}

	public JPALibrarianImpl(){}
	
	
}