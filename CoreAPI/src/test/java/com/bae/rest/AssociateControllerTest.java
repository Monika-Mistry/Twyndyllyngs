package com.bae.rest;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.verify;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import com.bae.TestConstants;
import com.bae.domain.Associate;

@RunWith(SpringRunner.class)
public class AssociateControllerTest {
	
	@InjectMocks
	private AssociateController controller;

	@Mock
	private RestTemplate restTemplate;
	
	
	@Test
	public void getAssociatesByFullNameAndAddressTest() {

		doReturn(TestConstants.MOCK_ASSOCIATE_RESPONSE).when(restTemplate).getForEntity(TestConstants.ASSOCIATE_FULLNAME_AND_ADDRESS,
				Associate[].class);

		assertEquals(TestConstants.MOCK_ASSOCIATE_RESPONSE, controller.getAssociatesByFullNameAndAddress(
				"John", 
				"Smith", 
				"16 HIGH ROAD, UPFORD, U43 2DX"
				));

		verify(restTemplate).getForEntity(TestConstants.ASSOCIATE_FULLNAME_AND_ADDRESS, Associate[].class);

	}
	
	@Test
	public void getAssociatesByPhoneNumberTest() {

		doReturn(TestConstants.MOCK_ASSOCIATE_RESPONSE).when(restTemplate).getForEntity(TestConstants.ASSOCIATE_PHONENUMBER,
				Associate[].class);

		assertEquals(TestConstants.MOCK_ASSOCIATE_RESPONSE, controller.getAssociatesByPhoneNumber(
				"01234 567890"
				));

		verify(restTemplate).getForEntity(TestConstants.ASSOCIATE_PHONENUMBER, Associate[].class);

	}

}
