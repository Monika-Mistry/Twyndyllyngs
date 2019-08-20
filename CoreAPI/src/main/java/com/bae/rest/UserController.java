package com.bae.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.bae.domain.User;

@RestController
public class UserController {

	private RestTemplate restTemplate;

	public UserController(@Autowired RestTemplate restTemplate) {

		this.restTemplate = restTemplate;
	}
	
	@PostMapping("/login")
	public void loginUser(@RequestBody User user) {
		
	}
	
	public void createUser() {
		
	}
	
	public void deleteUser() {
		
	}

}
