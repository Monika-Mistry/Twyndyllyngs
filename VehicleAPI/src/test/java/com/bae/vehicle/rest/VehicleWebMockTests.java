package com.bae.vehicle.rest;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.bae.TestConstants;
import com.bae.vehicle.service.VehicleService;

@RunWith(SpringRunner.class)
@AutoConfigureMockMvc
@WebMvcTest(VehicleController.class)
public class VehicleWebMockTests {
	
	@Autowired
	private MockMvc mockMvc;

	@MockBean
	private VehicleService service;
	
	@Test
	public void getVehicleByVehicleRegistrationNoTest() throws Exception {
		when(service.findByVehicleRegistrationNo("CRA 55Y")).thenReturn(TestConstants.MOCK_VEHICLE_REGISTRATION_1_ARRAY);
		
		mockMvc.perform(get("/getVehiclesByRegistrationNo/CRA 55Y"))
		.andExpect(content().string(containsString("CRA 55Y"))).andDo(print());
	}

	
	@Test
	public void getLocationsByVehicleRegistrationNoTest() throws Exception {
		when(service.findLocationsByVehicleRegistrationNo("CRA 55Y")).thenReturn(TestConstants.MOCK_VEHICLE_LOCATIONS_1_ARRAY);
		
		mockMvc.perform(get("/getLocationsByRegistrationNo/CRA 55Y"))
		.andExpect(content().string(containsString("CRA 55Y"))).andDo(print());
	}
	
	@Test void getVehicleByForenameSurnameAddress() throws Exception {
		when(service.findVehicleByForenameSurnameAddress("Crazy", "Ivan","543 Crazy Street, Crazy Town, CR 4ZY")).thenReturn(TestConstants.MOCK_VEHICLE_REGISTRATION_1_ARRAY);

		mockMvc.perform(get("/findVehicleByForenameSurnameAddress/Crazy/Ivan/543 Crazy Street, Crazy Town, CR 4ZY"))
		.andExpect(content().string(containsString("CRA 55Y"))).andDo(print());
	}
}
