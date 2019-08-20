package com.bae.service;

import org.springframework.stereotype.Service;

import com.bae.domain.User;

@Service
public class CoreServiceImpl implements CoreService{


	public boolean verifyLogin(User user) {
		boolean condition = user.getPassword().isEmpty() || user.getPassword() == null || user.getUsername().isEmpty() || user.getUsername() == null;
		return condition ? false : true;
	}

	
}
