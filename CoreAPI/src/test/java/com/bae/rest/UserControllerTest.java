package com.bae.rest;

import static org.junit.Assert.assertEquals;
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

		doReturn(true).when(service).verifyLogin(TestConstants.MOCK_USER);
		doReturn(TestConstants.MOCK_LOGIN_RESPONSE).when(restTemplate).exchange(Constants.LOGIN_USER_URL, HttpMethod.POST, requestEntity,
				String.class);

		assertEquals(TestConstants.MOCK_LOGIN_RESPONSE, controller.loginUser(TestConstants.MOCK_USER));

		verify(service).verifyLogin(TestConstants.MOCK_USER);
		verify(restTemplate).exchange(Constants.LOGIN_USER_URL, HttpMethod.POST, requestEntity, String.class);

	}

	@Test
	public void invalidUserLoginTest() {
		

		doReturn(false).when(service).verifyLogin(TestConstants.MOCK_EMPTY_USER);

		assertEquals(TestConstants.MOCK_FAIL_LOGIN_RESPONSE, controller.loginUser(TestConstants.MOCK_EMPTY_USER));

		verify(service).verifyLogin(TestConstants.MOCK_EMPTY_USER);

	}
	
	@Test
	public void createUserTest() {
		HttpEntity<User> requestEntity = new HttpEntity<>(TestConstants.MOCK_USER);

		doReturn(TestConstants.MOCK_CREATE_USER_RESPONSE).when(restTemplate).exchange(Constants.LOGIN_CREATE_URL, HttpMethod.POST, requestEntity,
				User.class);

		assertEquals(TestConstants.MOCK_CREATE_USER_RESPONSE, controller.createUser(TestConstants.MOCK_USER));

		verify(restTemplate).exchange(Constants.LOGIN_CREATE_URL, HttpMethod.POST, requestEntity, User.class);
	}
	
	@Test
	public void deleteUserTest() {
		doReturn(TestConstants.MOCK_SUCCESS).when(restTemplate).getForObject(TestConstants.MOCK_DELETE_USER_URL, String.class);
		
		assertEquals(TestConstants.MOCK_SUCCESS, controller.deleteUser(1L));
		
		verify(restTemplate).getForObject(TestConstants.MOCK_DELETE_USER_URL, String.class);
	}

}
