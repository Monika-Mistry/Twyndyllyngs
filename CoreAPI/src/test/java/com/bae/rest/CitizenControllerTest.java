package com.bae.rest;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import javax.net.ssl.SSLEngineResult.Status;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import com.bae.Constants;
import com.bae.TestConstants;
import com.bae.domain.Citizen;

@RunWith(SpringRunner.class)
public class CitizenControllerTest {

	@InjectMocks
	private CitizenController controller;

	@Mock
	private RestTemplate restTemplate;

	@Test
	public void findByForenameTest() {
		List<Citizen> MOCK_LIST = new ArrayList<>();
		MOCK_LIST.add(TestConstants.MOCK_CITIZEN);

		Citizen[] citizens = MOCK_LIST.toArray(new Citizen[MOCK_LIST.size()]);

		ResponseEntity<Citizen[]> response = new ResponseEntity<Citizen[]>(citizens, HttpStatus.OK);

		doReturn(response).when(restTemplate).exchange(Constants.CITIZEN_URL + "/getCitizensByForenames/user/Crazy",
				HttpMethod.GET, null, Citizen[].class);

		assertEquals(response, controller.findCitizenByForenames("Crazy", "user"));
	}

	@Test
	public void findByIdTest() {

		doReturn(TestConstants.MOCK_CITIZEN).when(restTemplate).getForObject(Constants.CITIZEN_URL + "/getCitizenById/user/" + 12348L,
				Citizen.class);

		assertEquals(TestConstants.MOCK_CITIZEN, controller.findCitizenById(12348L, "user"));
	}

	@Test
	public void findBySurnameTest() {
		List<Citizen> MOCK_LIST = new ArrayList<>();
		MOCK_LIST.add(TestConstants.MOCK_CITIZEN);

		Citizen[] citizens = MOCK_LIST.toArray(new Citizen[MOCK_LIST.size()]);

		ResponseEntity<Citizen[]> response = new ResponseEntity<Citizen[]>(citizens, HttpStatus.OK);

		doReturn(response).when(restTemplate).exchange(Constants.CITIZEN_URL + "/getCitizensBySurname/user/Ivan",
				HttpMethod.GET, null, Citizen[].class);

		assertEquals(response, controller.findCitizenBySurname("Ivan", "user"));
	}

	@Test
	public void findByForenameAndSurnameTest() {
		List<Citizen> MOCK_LIST = new ArrayList<>();
		MOCK_LIST.add(TestConstants.MOCK_CITIZEN);

		Citizen[] citizens = MOCK_LIST.toArray(new Citizen[MOCK_LIST.size()]);

		ResponseEntity<Citizen[]> response = new ResponseEntity<Citizen[]>(citizens, HttpStatus.OK);

		doReturn(response).when(restTemplate).exchange(Constants.CITIZEN_URL + "/getCitizensByFullname/user/Crazy/Ivan",
				HttpMethod.GET, null, Citizen[].class);

		assertEquals(response, controller.findCitizenByForenamesAndSurname("Crazy", "Ivan", "user"));
	}

}
