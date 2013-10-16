/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lms.service.impl;

import com.lms.jpa.Book;
import com.lms.jpa.Faculty;
import com.lms.service.FacultyService;
import java.util.Set;
import org.springframework.stereotype.Service;

/**
 *
 * @author deepshah
 */
@Service
public class FacultyServiceImpl implements FacultyService{

    @Override
    public void UpdateFacultyInfo(Faculty ofFaculty) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Set<Book> SearchBook(Book book) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean isBookAvailabile(Book book) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void RequestBook(Book requestedBook) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Set<Book> ViewIssuedBooks(Faculty ofFaculty) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public double CheckPayment(Faculty ofFaculty) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean isPaymentDone(Faculty ofFaculty) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
