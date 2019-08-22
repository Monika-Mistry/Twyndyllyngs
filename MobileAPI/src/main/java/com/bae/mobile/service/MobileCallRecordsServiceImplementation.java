package com.bae.mobile.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bae.mobile.domain.MobileCallRecords;
import com.bae.mobile.repository.MobileCallRecordsRepository;

@Service
public class MobileCallRecordsServiceImplementation implements MobileCallRecordsService {



	private MobileCallRecordsRepository mobileCallRecordsRepository;
	
	@Autowired
	public MobileCallRecordsServiceImplementation(MobileCallRecordsRepository mobileCallRecordsRepository) {

		this.mobileCallRecordsRepository = mobileCallRecordsRepository;
	}
	

	public MobileCallRecords[] findByCaller(String caller) {
		
		List<MobileCallRecords> callRecordsList = mobileCallRecordsRepository.findByCallerMSISDN(caller);
		
		return callRecordsList.toArray(new MobileCallRecords[callRecordsList.size()]);
	}


	public MobileCallRecords[] findByReceiver(String receiver) {
		
		List<MobileCallRecords> callRecordsList = mobileCallRecordsRepository.findByReceiverMSISDN(receiver);
		
		return callRecordsList.toArray(new MobileCallRecords[callRecordsList.size()]);
	}

	
	public MobileCallRecords[] findByCallerOrReceiver(String caller, String receiver) {
		
		List<MobileCallRecords> callRecordsList = mobileCallRecordsRepository.findByCallerMSISDNOrReceiverMSISDN(caller, receiver);
		
		return callRecordsList.toArray(new MobileCallRecords[callRecordsList.size()]);
	}

}
