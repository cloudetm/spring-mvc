package com.lms.controller.impl;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.management.RuntimeErrorException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.lms.jpa.Librarian;
import com.lms.jpa.impl.JPALibrarianImpl;
import com.lms.service.AdminService;

@Controller
@RequestMapping(value = "/admin")
public class AdminController {

	@Autowired
	AdminService adminService;

	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String home(Model model) {
		model.addAttribute("output", "Home Page");
		return "/admin/adminHome";
	}

	@RequestMapping(value = "/info/{id}", method = RequestMethod.GET)
	public ModelAndView info(@PathVariable("id") long id) throws Exception {
		Librarian l = adminService.getLirbrarianInfo(id);
		ModelAndView mv = new ModelAndView("/admin/adminInfo");
		mv.addObject("output", "Librarian Information");
		mv.addObject("librarian", l);
		return mv;
	}

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public ModelAndView list() throws Exception {
		List<Librarian> list = adminService.getAllLirbrarian();
		ModelAndView mv = new ModelAndView("/admin/adminList");
		mv.addObject("output", "All Librarians");
		mv.addObject("librarianList", list);
		return mv;
	}

	@RequestMapping("/insert")
	public ModelAndView showLibrarianPage() {
		ModelAndView mv = new ModelAndView("/admin/adminInsert");
		mv.addObject("output", "Librarian Form");
		mv.addObject("librarian", new JPALibrarianImpl());
		return mv;
	}

	@RequestMapping(value = "/oninsert", method = RequestMethod.POST)
	public String onSubmitLibrarian(
			@ModelAttribute("librarian") @Valid JPALibrarianImpl contact,
			BindingResult result, Model model) throws IllegalStateException,
			IOException {
		String saveDirectory ="C:/demo/";
		if (result.hasErrors()) {
			model.addAllAttributes(result.getModel());
			return "/admin/adminInsert";
		}
		String fileName = contact.getProfilePic().getOriginalFilename();
		contact.setProfilePicture(fileName);
		if (!fileName.equals("")) {
			File file = new File(saveDirectory + fileName);
			System.out.println(file.getAbsolutePath());
			if (file.exists()) {
				System.out.println("File already exists");
				throw new RuntimeErrorException(null, "File " + fileName
						+ "Already Exists");
			} else
				contact.getProfilePic().transferTo(file);
		}
		adminService.addLirbrarian(contact);
		return "/admin/adminHome";
	}

	@RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
	public String deleteLibrarian(@PathVariable("id") long id) throws Exception {
		adminService.deleteLirbrarian(id);
		return "redirect:/admin/list";
	}

}
