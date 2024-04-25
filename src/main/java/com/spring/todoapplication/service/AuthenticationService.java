package com.spring.todoapplication.service;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
	
	public boolean authenticate(String username, String password) {
		boolean isValidUsername = username.equalsIgnoreCase("admin");
		boolean isValidpassword = password.equalsIgnoreCase("admin");
		return isValidpassword && isValidUsername;
	}
}
