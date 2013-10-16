package com.lms.controller.impl;

import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.lms.model.impl.LoginForm;
import com.lms.service.LoginService;

@Controller
@RequestMapping("/login.html")
public class LoginController {

	@Autowired
	LoginService loginService;

	@RequestMapping(method = RequestMethod.GET)
	public String showForm(Map<String, LoginForm> model) {
		LoginForm loginForm = new LoginForm();
		model.put("loginForm", loginForm);
		return "login";
	}

	@RequestMapping(method = RequestMethod.POST)
	public String processForm(@ModelAttribute("loginForm") @Valid LoginForm loginForm, BindingResult result,
			Map<String, LoginForm> model) {
		String userName = loginForm.getUserName();
		String password = loginForm.getPassword();
		String user = loginForm.getUser();
		if (result.hasErrors()) {
			return "login";
		}
		loginForm = (LoginForm) model.get("loginForm");
		boolean output = loginService.login(user, userName, password);
		if (!output) {
			return "login";
		}
		if (user.equals("admin")) {
			if(output){	
			model.put("loginForm", loginForm);
				return "/admin/adminHome";
			}
		}
		else if (user.equals("librairian")) {
			if(output){
				model.put("loginForm", loginForm);
				return "/admin/adminHome";
			}
		}
		else if (user.equals("student")) {
			if(output){
				model.put("loginForm", loginForm);
				return "/student/studentHome";
			}
		}
		else if (user.equals("faculty")) {
			if(output){
				model.put("loginForm", loginForm);
				return "/admin/adminHome";
			}
		}
		return "login";
	}
}
