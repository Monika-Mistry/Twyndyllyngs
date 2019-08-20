package com.bae.service;

import org.springframework.stereotype.Service;
import com.google.common.base.Strings;

import com.bae.domain.User;

@Service
public class CoreServiceImpl implements CoreService{


	public boolean verifyLogin(User user) {
		boolean condition =  Strings.isNullOrEmpty(user.getPassword()) || Strings.isNullOrEmpty(user.getUsername());
		return condition ? false : true;
	}

	
}
