import java.util.Iterator;
import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.lms.jpa.Librarian;
import com.lms.jpa.impl.JPALibrarianImpl;
import com.lms.service.AdminService;


@ContextConfiguration(locations = { "classpath*:test-context.xml" })
@RunWith(SpringJUnit4ClassRunner.class)
public class TestFile {
	static Logger log = Logger.getLogger(TestFile.class.getName());

	
	

	/*
	@Autowired
	AdminService adminService;
	
	@Autowired
	DAOBook bookDAO;

	@Autowired
	DAOStudent studentDAO;

	@Autowired
	DAOFaculty facultyDAO;

	
	@Autowired
	DAOBookIssuedDetail bookIssuedDetailDAO;

	*/
	@Test
	public void testJPA() {
//  ----------------------------- Book Test ----------------------------- 
	/*	Book i1, i2;
		Book r1, r2;
		Book ui, ur;
		i1 = new JPABookImpl(0, "Theory Of Computation", "abc", "Compiler", 10,
				10, 0, 50);
		i2 = new JPABookImpl(0, "Complier Structure", "abc Shah", "Compiler",
				10, 10, 0, 50);
		r1 = new JPABookImpl(0, "Theory Of Computation", "abc", "Compiler", 10,
				10, 0, 50);
		r2 = new JPABookImpl(0, "Complier Structure", "abc Shah", "Compiler",
				10, 10, 0, 50);

		ui = new JPABookImpl(1L, "Complier Structure", "Updated abc",
				"Compiler", 20, 20, 0, 100);
		ur = new JPABookImpl(2L, "Complier Structure", "Updated 3rd abc",
				"Compiler", 20, 20, 0, 100);

		bookDAO.insertBook(i1);
		bookDAO.insertBook(i2);
		bookDAO.insertBook(r1);
		bookDAO.insertBook(r2);
		bookDAO.updateBook(ui);
		bookDAO.updateBook(ur);
	
		// bookDAO.deleteBook(5L);

		Book fetchBook = bookDAO.fetchBookInfo(1L);
		log.info("Book Name : " + fetchBook.getBookName() + "| = |"
				+ "Copies  : " + fetchBook.getAvailableCopies());
		List<Book> fetchBooks = bookDAO.fetchAllBooks();

		Iterator<Book> i = fetchBooks.iterator();
		while (i.hasNext()) {
			Book item = i.next();
			log.info("Names  : " + item.getAuthor());
		}
		
	//  ----------------------------- Faculty Test -----------------------------
		
		Faculty f1, f2, fu;
		f1 = new JPAFacultyImpl(0, "abc", "abc", "Shah", "bbb",
				"abc@gmail.com", "deep", "9033694227", "Computer");

		f2 = new JPAFacultyImpl(0, "cd", "abc", "Shah", "aaa", "cd@gmail.com",
				"deep", "9033694227", "Computer");

		fu = new JPAFacultyImpl(1L, "updated abc", "abc", "Shah", "aaa",
				"abc@gmail.com", "abc", "9033694227", "Computer");

		facultyDAO.insertFaculty(f1);
		facultyDAO.insertFaculty(f2);

		facultyDAO.updateFaculty(fu);
		Faculty fetchFaculty = facultyDAO.fetchFacultyInfo(1L);
		log.info("first name : " + fetchFaculty.getFirstName() + " | == | "
				+ "last name  : " + fetchFaculty.getLastName());
		List<Faculty> fetchAllFaculty = facultyDAO.fetchAllFaculties();
		Iterator<Faculty> j = fetchAllFaculty.iterator();
		while (j.hasNext()) {
			Faculty item = j.next();
			log.info("Names  : " + item.getFirstName());
		}
	*/		
	//  ----------------------------- Librarian Test ----------------------------- 
	
/*		Librarian l1, l2, lu;
		l1 = new JPALibrarianImpl(0, "abc", "abc", "Shah", "bbb",
				"abc@gmail.com", "deep", "9033694227");

		l2 = new JPALibrarianImpl(0, "cd", "abc", "Shah", "aaa",
				"cd@gmail.com", "deep", "9033694227");

		lu = new JPALibrarianImpl(1L, "updated abc", "abc", "Shah", "aaa",
				"abc@gmail.com", "abc", "9033694227");

		adminService.addLirbrarian(l1);
		adminService.addLirbrarian(l2);

		adminService.updateLirbrarian(lu);
		Librarian fetchLibrarian = adminService.getLirbrarianInfo(1L);
		log.info("first name : " + fetchLibrarian.getFirstName() + " ||  "
				+ "middle name : "+ fetchLibrarian.getMiddleName() + " ||  "
				+ "last name  : " + fetchLibrarian.getLastName()+ " ||  "
				+ "mobile number  : " + fetchLibrarian.getMobileNumber()+ " ||  "
				+ "username  : " + fetchLibrarian.getUsername()+ " ||  "
				+ "passsword  : " + fetchLibrarian.getPassword()+ " ||  "
				+ "email  : " + fetchLibrarian.getEmail());
		
		List<Librarian> fetchAllLibrarian = adminService.getAllLirbrarian();
		Iterator<Librarian> l = fetchAllLibrarian.iterator();
		while (l.hasNext()) {
			Librarian item = l.next();
			log.info("Id : " + item.getLibrarianId() + " ||  "
					+ "first name : " + item.getFirstName() + " ||  "
					+ "middle name : "+ item.getMiddleName() + " ||  "
					+ "last name  : " + item.getLastName()+ " ||  "
					+ "mobile number  : " + item.getMobileNumber()+ " ||  "
					+ "username  : " + item.getUsername()+ " ||  "
					+ "passsword  : " + item.getPassword()+ " ||  "
					+ "email  : " + item.getEmail());
		}
*/		
	/*	
	 * adminService.DeleteAllBooks();
	 * adminService.DeleteAllFaculties();
	 * adminService.DeleteAllStudents();
	 * adminService.DeleteAllLibrarians(); 	
	*/
		
		
		
	} // End of Test Method
	
}// End of Class
