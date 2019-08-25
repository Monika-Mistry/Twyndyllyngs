package com.bae.associate.rest;

import static org.junit.Assert.assertEquals;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.bae.associate.service.AssociateService;
import com.example.associate.TestConstants;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AssociateMockitoTests {

	@InjectMocks
	AssociateController controller;
	
	@Mock 
	AssociateService service;
	
s	@Test
	public void getAssociatesbyFullnameTest() {
		Mockito.when(service.findAssociatesByPhonenumber("07700 049488")).thenReturn(TestConstants.MOCK_ASSOCIATES_ARRAY);

		assertEquals(TestConstants.MOCK_ASSOCIATES_ARRAY, controller.findAssociatesByPhonenumber("Aaron"));
		Mockito.verify(service).findAssociatesByPhonenumber("Aaron");
	}
		
	
}
