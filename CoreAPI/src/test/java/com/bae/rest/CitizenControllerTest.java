package com.bae.rest;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.verify;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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

	private static List<Citizen> MOCK_LIST;
	private static Citizen[] citizens;

	@BeforeClass
	public static void setup() {
		MOCK_LIST = new ArrayList<>();
		MOCK_LIST.add(TestConstants.MOCK_CITIZEN);

		citizens = MOCK_LIST.toArray(new Citizen[MOCK_LIST.size()]);
	}

	@Test
	public void findByForenameTest() {

		doReturn(TestConstants.MOCK_CITIZEN_RESPONSE).when(restTemplate).exchange(TestConstants.CITIZEN_FORENAME,
				HttpMethod.GET, null, Citizen[].class);

		assertEquals(TestConstants.MOCK_CITIZEN_RESPONSE, controller.findCitizenByForenames("Crazy", "user"));

		verify(restTemplate).exchange(TestConstants.CITIZEN_FORENAME, HttpMethod.GET, null, Citizen[].class);

	}

	@Test
	public void findByIdTest() {

		doReturn(TestConstants.MOCK_CITIZEN).when(restTemplate).getForObject(TestConstants.CITIZEN_ID, Citizen.class);

		assertEquals(TestConstants.MOCK_CITIZEN, controller.findCitizenById(12348L, "user"));

		verify(restTemplate).getForObject(TestConstants.CITIZEN_ID, Citizen.class);
	}

	@Test
	public void findBySurnameTest() {

		doReturn(TestConstants.MOCK_CITIZEN_RESPONSE).when(restTemplate).exchange(TestConstants.CITIZEN_SURNAME,
				HttpMethod.GET, null, Citizen[].class);

		assertEquals(TestConstants.MOCK_CITIZEN_RESPONSE, controller.findCitizenBySurname("Ivan", "user"));

		verify(restTemplate).exchange(TestConstants.CITIZEN_SURNAME, HttpMethod.GET, null, Citizen[].class);
	}

	@Test
	public void findByForenameAndSurnameTest() {

		doReturn(TestConstants.MOCK_CITIZEN_RESPONSE).when(restTemplate).exchange(TestConstants.CITIZEN_FULLNAME,
				HttpMethod.GET, null, Citizen[].class);

		assertEquals(TestConstants.MOCK_CITIZEN_RESPONSE,
				controller.findCitizenByForenamesAndSurname("Crazy", "Ivan", "user"));

		verify(restTemplate).exchange(TestConstants.CITIZEN_FULLNAME, HttpMethod.GET, null, Citizen[].class);
	}

}
