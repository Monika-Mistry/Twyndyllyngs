package com.bae.associate.rest;

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
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.bae.associate.service.AssociateService;
import com.example.associate.TestConstants;

@RunWith(SpringRunner.class)
@AutoConfigureMockMvc
@WebMvcTest(AssociateController.class)
public class AssociateWebMockTests {
	
	@Autowired
	private MockMvc mockMvc;

	@MockBean
	private AssociateService service;
	
	@Test
	public void getAssociatesbyFullnameTest() throws Exception {
		when(service.findByForenamesAndSurname("Aaron", "Smith")).thenReturn(TestConstants.MOCK_ASSOCIATES_ARRAY);
		
		mockMvc.perform(get("/getAssociateByFullname/Aaron/Smith"))
		.andExpect(content().string(containsString("Aaron"))).andDo(print());
	}

}
