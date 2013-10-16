package com.lms.service;

import java.util.List;

import com.lms.jpa.Librarian;

public interface AdminService {

	public void addLirbrarian(Librarian newLibrarian);

	public void updateLirbrarian(Librarian updatingLibrarian);

	public void deleteLirbrarian(long librarianId);

	public boolean checkLibrarian(long librarianId);

	public List<Librarian> getAllLirbrarian();

	public Librarian getLirbrarianInfo(long librarianId);

	public void DeleteAllLibrarians();

	public void DeleteAllStudents();

	public void DeleteAllBooks();

	public void DeleteAllFaculties();
}
