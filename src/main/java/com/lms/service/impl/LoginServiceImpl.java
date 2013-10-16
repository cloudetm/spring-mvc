package com.lms.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lms.dao.DAOFaculty;
import com.lms.dao.DAOLibrarian;
import com.lms.dao.DAOStudent;
import com.lms.service.LoginService;

@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	DAOLibrarian librarianDAO;

	@Autowired
	DAOFaculty facultyDAO;

	@Autowired
	DAOStudent studentDAO;

	@Override
	public boolean login(String user, String username, String password) {
		if (user.equals(null) || username.equals(null) || password.equals(null))
			return false;
		if (user.equals("admin") && username.equals("a")
				&& password.equals("a"))
			return true;
		else if (user.equals("librarian") && username.equals("a")
				&& password.equals("a"))
			return true;
		else if (user.equals("student") && username.equals("a")
				&& password.equals("a"))
			return true;
		else if (user.equals("faculty") && username.equals("a")
				&& password.equals("a"))
			return true;
		else
			return false;

	}
}
