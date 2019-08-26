package com.bae.associate.rest;

import static org.hamcrest.CoreMatchers.containsString;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

import java.util.ArrayList;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.bae.associate.Associate;
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
	
//	@Ignore
//	@Test
//	public void getAssociatesByPhoneNumberTest() throws Exception {
//		when(service.findAssociatesByPhonenumber("07700 049488")).thenReturn((ArrayList<Associate>) TestConstants.MOCK_ASSOCIATES_1);
//		
//		mockMvc.perform(get("/getAssociateByPhonenumbere/07700 049488"))
//		.andExpect(content().string(containsString("John"))).andDo(print());
//	}

}
