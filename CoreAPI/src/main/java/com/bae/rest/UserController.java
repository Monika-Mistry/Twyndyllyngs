package com.bae.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.bae.Constants;
import com.bae.domain.User;
import com.bae.service.CoreService;

@RestController
public class UserController {

	private RestTemplate restTemplate;
	
	private CoreService service;

	public UserController(@Autowired RestTemplate restTemplate) {

		this.restTemplate = restTemplate;
	}
	
	@PostMapping("/loginUser")
	public ResponseEntity<String> loginUser(@RequestBody User user) {
		if(service.verifyLogin(user)) {
			HttpEntity<User> requestEntity = new HttpEntity<>(user);
			return restTemplate.exchange(Constants.LOGIN_USER, HttpMethod.POST, requestEntity, String.class);
		}
		else {
			return new ResponseEntity<String>("Invalid login credentials", HttpStatus.PRECONDITION_FAILED);
		}
		
	}
	
	@PostMapping("/createUser")
	public void createUser(@RequestBody User user) {
		
	}
	
	@GetMapping("/deleteUser/{id}")
	public void deleteUser(@PathVariable ("id") Long id) {
		
	}

}
