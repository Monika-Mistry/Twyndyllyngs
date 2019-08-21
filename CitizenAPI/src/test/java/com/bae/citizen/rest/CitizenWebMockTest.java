package com.bae.citizen.rest;

import static org.hamcrest.CoreMatchers.containsString;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.bae.citizen.TestConstants;
import com.bae.citizen.service.CitizenService;

@RunWith(SpringRunner.class)
@WebMvcTest(CitizenController.class)
@AutoConfigureMockMvc
public class CitizenWebMockTest {

	@Autowired
	private MockMvc mockMvc;

	@MockBean
	private CitizenService service;
		
	@WithMockUser(value = "spring")
	@Test
	public void getCitizensByForenamesTest() throws Exception {
		

		when(service.findByForenames("Aaron")).thenReturn(TestConstants.MOCK_CITIZENS_ARRAY);

		mockMvc.perform(get("/getCitizensByForenames/1234/" + "Aaron"))
				.andExpect(content().string(containsString("Aaron"))).andDo(print());

	}
	
	@WithMockUser(value = "spring")
	@Test
	public void getCitizensBySurnameTest() throws Exception {

		when(service.findBySurname("Aarvark")).thenReturn(TestConstants.MOCK_CITIZEN_1_ARRAY);

		mockMvc.perform(get("/getCitizensBySurname/1234/" + "Aarvark"))
				.andExpect(content().string(containsString("Aarvark"))).andDo(print());

	}

	@WithMockUser(value = "spring")
	@Test
	public void getCitizensByFullnameTest() throws Exception {

		when(service.findByForenamesAndSurname("Aaron", "Aarvark")).thenReturn(TestConstants.MOCK_CITIZEN_1_ARRAY);

		mockMvc.perform(get("/getCitizensByFullname/1234/" + "Aaron/" + "Aarvark"))
				.andExpect(content().string(containsString("Aaron")))
				.andExpect(content().string(containsString("Aarvark"))).andDo(print());

	}

}
