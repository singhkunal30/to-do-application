package com.spring.todoapplication.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.spring.todoapplication.service.AuthenticationService;

@Controller
@SessionAttributes("name")
public class LoginController {
	
	private AuthenticationService authService;
	
	public LoginController(AuthenticationService authService) {
		super();
		this.authService = authService;
	}

	@RequestMapping(value = "login", method = RequestMethod.GET)
	public String login(){
		return "login";
	}
	
	@RequestMapping(value = "login", method = RequestMethod.POST)
	public String WelcomePage(@RequestParam String name, @RequestParam String password, ModelMap map){	
		//Authentication
		//name & pass - admin
		if(authService.authenticate(name, password)) {
			map.put("name", name);
			return "welcome";
		}
		map.put("errorMessage", "Invalid Credentials");
		return "login";
	}
}
