package com.bae.rest;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.verify;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import com.bae.TestConstants;
import com.bae.domain.CarObject;
import com.bae.domain.VehicleLocation;
import com.bae.domain.VehicleRegistration;

import junit.framework.Assert;

@RunWith(SpringRunner.class)
public class CarControllerTest {

	@InjectMocks
	private CarController controller;

	@Mock
	private RestTemplate restTemplate;

//	@Mock
//	private JmsTemplate jmsTemplate;

	@SuppressWarnings("deprecation")
	@Test
	public void getCarDetails() {

		doReturn(TestConstants.MOCK_CAR_REG_RESPONSE).when(restTemplate)
				.getForEntity(TestConstants.VEHICLE_REGISTRATION, VehicleRegistration[].class);

		doReturn(TestConstants.MOCK_CAR_LOCATION_RESPONSE).when(restTemplate)
				.getForEntity(TestConstants.VEHICLE_LOCATION, VehicleLocation[].class);
		ResponseEntity<CarObject> response = controller.getCarDetails("CRA 55Y");
		
		assertEquals(TestConstants.MOCK_CAR_RESPONSE.getBody().getVehicleLocation(), response.getBody().getVehicleLocation());
		assertEquals(TestConstants.MOCK_CAR_RESPONSE.getBody().getVehicleRegistration(), response.getBody().getVehicleRegistration());

		verify(restTemplate).getForEntity(TestConstants.VEHICLE_REGISTRATION, VehicleRegistration[].class);
		verify(restTemplate).getForEntity(TestConstants.VEHICLE_LOCATION, VehicleLocation[].class);
	}

}
