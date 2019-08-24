package com.bae.associate.rest;

import static org.junit.Assert.assertEquals;

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
	
	@Test
	public void getAssociatesbyFullnameTest() {
		Mockito.when(service.findByForenamesAndSurname("Aaron", "Smith")).thenReturn(TestConstants.MOCK_ASSOCIATES_ARRAY);

		assertEquals(TestConstants.MOCK_ASSOCIATES_ARRAY, controller.findAssociateByFullname("Aaron", "Smith"));
		Mockito.verify(service).findByForenamesAndSurname("Aaron", "Smith");
	}
		
	
}
