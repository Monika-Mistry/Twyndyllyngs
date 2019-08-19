package com.bae.rest;

import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import javax.net.ssl.SSLEngineResult.Status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
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
		ResponseEntity<List<Citizen>> response = new ResponseEntity<List<Citizen>>(MOCK_LIST, null, Status.OK);
		
		when(restTemplate.exchange(Constants.CITIZEN_URL + "/getCitizensByForenames/1/Crazy",
				HttpMethod.GET, null, new ParameterizedTypeReference<List<Citizen>>() {
				})).thenReturn(response)
	}

}
