/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lms.service.impl;

import com.lms.jpa.Book;
import com.lms.jpa.Student;
import com.lms.service.StudentService;
import java.util.Set;
import org.springframework.stereotype.Service;

/**
 *
 * @author deepshah
 */
@Service
public class StudentServiceImpl implements StudentService{

    @Override
    public void UpdateStudentInfo(Student ofStudent) {
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
    public Set<Book> ViewIssuedBooks(Student ofStudent) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public double CheckPayment(Student ofStudent) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean isPaymentDone(Student ofStudent) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
