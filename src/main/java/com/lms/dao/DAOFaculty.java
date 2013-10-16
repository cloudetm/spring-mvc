package com.lms.dao;

import com.lms.jpa.Faculty;
import java.util.List;

public interface DAOFaculty {
      
    public boolean facultyExist(long facultyId);
	
    public void insertFaculty(Faculty faculty);

    public void updateFaculty(Faculty faculty);
	
    public void deleteFaculty(long facultyId);
	
    public Faculty fetchFacultyInfo(long facultyId);
	
    public List<Faculty> fetchAllFaculties();
    
    public void clearFacultiesTable();
}
