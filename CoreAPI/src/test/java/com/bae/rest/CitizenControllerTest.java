package com.bae.rest;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.verify;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import com.bae.TestConstants;
import com.bae.domain.Citizen;

@RunWith(SpringRunner.class)
public class CitizenControllerTest {

	@InjectMocks
	private CitizenController controller;

	@Mock
	private RestTemplate restTemplate;

	@Mock
	private JmsTemplate jmsTemplate;

	@Test
	public void findByForenameTest() {

		doReturn(TestConstants.MOCK_CITIZEN_RESPONSE).when(restTemplate).getForEntity(TestConstants.CITIZEN_FORENAME,
				Citizen[].class);

		assertEquals(TestConstants.MOCK_CITIZEN_RESPONSE, controller.getAllCitizens("Crazy", "null", "null", "Test"));

		verify(restTemplate).getForEntity(TestConstants.CITIZEN_FORENAME, Citizen[].class);

	}

	@Test
	public void findBySurnameTest() {

		doReturn(TestConstants.MOCK_CITIZEN_RESPONSE).when(restTemplate).getForEntity(TestConstants.CITIZEN_SURNAME,
				Citizen[].class);

		assertEquals(TestConstants.MOCK_CITIZEN_RESPONSE, controller.getAllCitizens("null", "Ivan", "null", "Test"));

		verify(restTemplate).getForEntity(TestConstants.CITIZEN_SURNAME, Citizen[].class);
	}

	@Test
	public void findByForenameAndSurnameTest() {

		doReturn(TestConstants.MOCK_CITIZEN_RESPONSE).when(restTemplate).getForEntity(TestConstants.CITIZEN_FULLNAME,
				Citizen[].class);
		assertEquals(TestConstants.MOCK_CITIZEN_RESPONSE, controller.getAllCitizens("Crazy", "Ivan", "null", "Test"));

		verify(restTemplate).getForEntity(TestConstants.CITIZEN_FULLNAME, Citizen[].class);
	}
	
	@Test
	public void findByForenameAndSurnameAndAddressTest() {

		doReturn(TestConstants.MOCK_CITIZEN_RESPONSE).when(restTemplate).getForEntity(TestConstants.CITIZEN_FULLNAME_AND_ADDRESS,
				Citizen[].class);
		assertEquals(TestConstants.MOCK_CITIZEN_RESPONSE, controller.getAllCitizens("Crazy", "Ivan", "543 Crazy Street, Crazy Town, CR 4ZY", "Test"));

		verify(restTemplate).getForEntity(TestConstants.CITIZEN_FULLNAME_AND_ADDRESS, Citizen[].class);
	}

}
