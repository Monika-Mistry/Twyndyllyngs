package com.bae.rest;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.verify;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import com.bae.TestConstants;
import com.bae.domain.Associate;
import com.bae.domain.MobileCallRecords;
import com.bae.domain.PeopleMobile;

@RunWith(SpringRunner.class)
public class MobileControllerTest {
	
	@InjectMocks
	private MobileController controller;

	@Mock
	private RestTemplate restTemplate;
	
	@Test
	public void getCallRecordsByCallerTest() {

		doReturn(TestConstants.MOCK_CALL_RECORD_RESPONSE).when(restTemplate).getForEntity(TestConstants.CALL_RECORDS_PHONENUMBER,
				MobileCallRecords[].class);

		assertEquals(TestConstants.MOCK_CALL_RECORD_RESPONSE, controller.getCallRecordsByCaller(
				"01234567890"));

		verify(restTemplate).getForEntity(TestConstants.CALL_RECORDS_PHONENUMBER, MobileCallRecords[].class);

	}
	@Test
	public void getMobileByFullnameAndAddress() {

		doReturn(TestConstants.MOCK_PEOPLE_MOBILE_RESPONSE).when(restTemplate).getForEntity(TestConstants.PEOPLE_MOBILE_FULLNAME_AND_ADDRESS,
				PeopleMobile[].class);

		assertEquals(TestConstants.MOCK_PEOPLE_MOBILE_RESPONSE, controller.getMobileByFullnameAndAddress(
				"Aaron",
				"Aarvark",
				"34 Megaroad Megatown M6 7RQ"));

		verify(restTemplate).getForEntity(TestConstants.PEOPLE_MOBILE_FULLNAME_AND_ADDRESS, PeopleMobile[].class);

	}

}
