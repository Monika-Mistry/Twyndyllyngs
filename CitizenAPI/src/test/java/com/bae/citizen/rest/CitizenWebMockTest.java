package com.bae.citizen.rest;

import static org.hamcrest.CoreMatchers.containsString;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.bae.citizen.TestConstants;
import com.bae.citizen.domain.Citizen;
import com.bae.citizen.service.CitizenService;

@RunWith(SpringRunner.class)
@WebMvcTest(CitizenController.class)
@AutoConfigureMockMvc
public class CitizenWebMockTest {

	@Autowired
	private MockMvc mockMvc;

	@MockBean
	private CitizenService service;

	@Test
	public void getCitizensByForenamesTest() throws Exception {
		List<Citizen> MOCK_LIST = new ArrayList<>();
		MOCK_LIST.add(TestConstants.MOCK_CITIZEN_1);
		MOCK_LIST.add(TestConstants.MOCK_CITIZEN_2);

		when(service.findByForenames("Aaron")).thenReturn(MOCK_LIST);

		mockMvc.perform(get("/getCitizensByForenames/1234/" + "Aaron"))
				.andExpect(content().string(containsString("Aaron"))).andDo(print());

	}

	@Test
	public void getCitizensBySurnameTest() throws Exception {
		List<Citizen> MOCK_LIST = new ArrayList<>();
		MOCK_LIST.add(TestConstants.MOCK_CITIZEN_1);

		when(service.findBySurname("Aarvark")).thenReturn(MOCK_LIST);

		mockMvc.perform(get("/getCitizensBySurname/1234/" + "Aarvark"))
				.andExpect(content().string(containsString("Aarvark"))).andDo(print());

	}

	@Test
	public void getCitizensByFullnameTest() throws Exception {
		List<Citizen> MOCK_LIST = new ArrayList<>();
		MOCK_LIST.add(TestConstants.MOCK_CITIZEN_1);

		when(service.findByForenamesAndSurname("Aaron", "Aarvark")).thenReturn(MOCK_LIST);

		mockMvc.perform(get("/getCitizensByFullname/1234/" + "Aaron/" + "Aarvark"))
				.andExpect(content().string(containsString("Aaron")))
				.andExpect(content().string(containsString("Aarvark"))).andDo(print());

	}

}
