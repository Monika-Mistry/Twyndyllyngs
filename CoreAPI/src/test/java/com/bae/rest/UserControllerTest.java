package com.bae.rest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.verify;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import com.bae.Constants;
import com.bae.TestConstants;
import com.bae.domain.User;
import com.bae.service.CoreService;

@RunWith(SpringRunner.class)
public class UserControllerTest {

	@InjectMocks
	private UserController controller;

	@Mock
	private CoreService service;

	@Mock
	private RestTemplate restTemplate;

	@Test
	public void validUserLoginTest() {
		HttpEntity<User> requestEntity = new HttpEntity<>(TestConstants.MOCK_USER);
		ResponseEntity<String> response = new ResponseEntity<String>("User Logged In", HttpStatus.OK);

		doReturn(true).when(service).verifyLogin(TestConstants.MOCK_USER);
		doReturn(response).when(restTemplate).exchange(Constants.LOGIN_USER_URL, HttpMethod.POST, requestEntity,
				String.class);

		assertEquals(response, controller.loginUser(TestConstants.MOCK_USER));

		verify(service).verifyLogin(TestConstants.MOCK_USER);
		verify(restTemplate).exchange(Constants.LOGIN_USER_URL, HttpMethod.POST, requestEntity, String.class);

	}

	@Test
	public void invalidUserLoginTest() {
		ResponseEntity<String> response = new ResponseEntity<String>("Invalid login credentials",
				HttpStatus.PRECONDITION_FAILED);

		doReturn(false).when(service).verifyLogin(TestConstants.MOCK_EMPTY_USER);

		assertEquals(response, controller.loginUser(TestConstants.MOCK_USER));

		verify(service).verifyLogin(TestConstants.MOCK_USER);

	}

}
