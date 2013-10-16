package com.lms.dao;

import com.lms.jpa.Student;
import java.util.List;

public interface DAOStudent {

    public boolean studentExist(long studentId);

    public void insertStudent(Student student);

    public void updateStudent(Student student);

    public void deleteStudent(long studentId);

    public Student fetchStudentInfo(long studentId);

    public List<Student> fetchAllStudents();
    
    public void clearStudentsTable();
}
