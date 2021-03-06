package com.bae.rest;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.verify;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.http.ResponseEntity;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import com.bae.TestConstants;
import com.bae.domain.CarObject;
import com.bae.domain.VehicleLocations;
import com.bae.domain.VehicleRegistration;


@RunWith(SpringRunner.class)
public class VehicleControllerTest {

	@InjectMocks
	private VehicleController controller;

	@Mock
	private RestTemplate restTemplate;

	@Mock
	private JmsTemplate jmsTemplate;

	@Test
	public void getCarDetails() {

		doReturn(TestConstants.MOCK_VEHICLE_REG_RESPONSE).when(restTemplate)
				.getForEntity(TestConstants.VEHICLE_REGISTRATION, VehicleRegistration[].class);

		doReturn(TestConstants.MOCK_VEHICLE_LOCATION_RESPONSE).when(restTemplate)
				.getForEntity(TestConstants.VEHICLE_LOCATION, VehicleLocations[].class);
		
		ResponseEntity<CarObject> response = controller.getCarDetails("CRA 55Y", "Test");
		
		assertArrayEquals(TestConstants.MOCK_VEHICLE_LOCATION, response.getBody().getVehicleLocation());
		assertArrayEquals(TestConstants.MOCK_VEHICLE_REGISTRATION, response.getBody().getVehicleRegistration());

		verify(restTemplate).getForEntity(TestConstants.VEHICLE_REGISTRATION, VehicleRegistration[].class);
		verify(restTemplate).getForEntity(TestConstants.VEHICLE_LOCATION, VehicleLocations[].class);
	}

	@Test
	public void getDetailsByFullnameAndAddress() {
		doReturn(TestConstants.MOCK_VEHICLE_REG_RESPONSE).when(restTemplate)
		.getForEntity(TestConstants.VEHICLE_REGISTRATION_NAME_ADD, VehicleRegistration[].class);
		
		assertEquals(TestConstants.MOCK_VEHICLE_REG_RESPONSE, controller.findVehicleByForenameSurnameAddress("Crazy", "Ivan", "543 Crazy Street, Crazy Town, CR 4ZY"));

		verify(restTemplate).getForEntity(TestConstants.VEHICLE_REGISTRATION_NAME_ADD, VehicleRegistration[].class);
		
	}
	
}
