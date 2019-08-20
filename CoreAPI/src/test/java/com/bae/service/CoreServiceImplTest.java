package com.bae.service;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.test.context.junit4.SpringRunner;

import com.bae.TestConstants;

@RunWith(SpringRunner.class)
public class CoreServiceImplTest {
	
	@InjectMocks
	private CoreServiceImpl service;
	
	@Test
	public void verifyCorrectLoginTest() {

		assertEquals(true, service.verifyLogin(TestConstants.MOCK_USER));
	}
	
	@Test
	public void verifyIncorrectLoginTest() {
		assertEquals(false, service.verifyLogin(TestConstants.MOCK_EMPTY_USER));
	}

	@Test
	public void verifyNullLoginTest() {
		System.out.println(TestConstants.MOCK_NULL_USER.getUsername());
		assertEquals(false, service.verifyLogin(TestConstants.MOCK_NULL_USER));
	}
	
	
}
