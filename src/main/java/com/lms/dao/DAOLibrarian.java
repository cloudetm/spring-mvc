package com.lms.dao;

import com.lms.jpa.Librarian;
import java.util.List;

public interface DAOLibrarian {

    public boolean librarianExist(long librarianId);

    public void insertLibrarian(Librarian librarian);

    public void updateLibrarian(Librarian librarian);

    public void deleteLibrarian(long librarianId);

    public Librarian fetchLibrarianInfo(long librarianId);

    public List<Librarian> fetchAllLibrarians();
	
    public void clearLibrariansTable();
}
