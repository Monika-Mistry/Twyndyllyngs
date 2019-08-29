package com.bae.vehicle.rest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.bae.TestConstants;
import com.bae.vehicle.service.VehicleService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class VehicleMockitoTests {
	
	@InjectMocks
	private VehicleController controller;
	
	@Mock
	private VehicleService service;
	
	@Test
	public void getVehicleByVehicleRegistrationNoTest() {
		
		Mockito.when(service.findByVehicleRegistrationNo("CRA 55Y")).thenReturn(TestConstants.MOCK_VEHICLE_REGISTRATION_1_ARRAY);

		assertEquals(TestConstants.MOCK_VEHICLE_REGISTRATION_RESPONSE, controller.getVehiclesByRegistrationNo("CRA 55Y"));
		Mockito.verify(service).findByVehicleRegistrationNo("CRA 55Y");
		
	}
	
	@Test
	public void getLocationsByVehicleRegistrationNoTest() {
		
		Mockito.when(service.findLocationsByVehicleRegistrationNo("CRA 55Y")).thenReturn(TestConstants.MOCK_VEHICLE_LOCATIONS_1_ARRAY);

		assertEquals(TestConstants.MOCK_VEHICLE_LOCATIONS_RESPONSE, controller.getLocationsByRegistrationNo("CRA 55Y"));
		Mockito.verify(service).findLocationsByVehicleRegistrationNo("CRA 55Y");
		
	}
	
	@Test
	public void getVechileByForenameSurnameAddressTest() {
		Mockito.when(service.findVehicleByForenameSurnameAddress("Crazy", "Ivan","543 Crazy Street, Crazy Town, CR 4ZY")).thenReturn(TestConstants.MOCK_VEHICLE_REGISTRATION_1_ARRAY);

		assertEquals(TestConstants.MOCK_VEHICLE_REGISTRATION_RESPONSE, controller.findVehicleByForenameSurnameAddress("Crazy", "Ivan","543 Crazy Street, Crazy Town, CR 4ZY"));
		Mockito.verify(service).findVehicleByForenameSurnameAddress("Crazy", "Ivan","543 Crazy Street, Crazy Town, CR 4ZY");
	}

}
