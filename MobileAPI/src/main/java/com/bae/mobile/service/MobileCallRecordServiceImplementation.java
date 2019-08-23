package com.bae.mobile.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bae.mobile.domain.MobileCallRecord;
import com.bae.mobile.repository.MobileCallRecordRepository;

@Service
public class MobileCallRecordServiceImplementation implements MobileCallRecordService {



	private MobileCallRecordRepository mobileCallRecordsRepository;
	
	@Autowired
	public MobileCallRecordServiceImplementation(MobileCallRecordRepository mobileCallRecordsRepository) {

		this.mobileCallRecordsRepository = mobileCallRecordsRepository;
	}
	

	public MobileCallRecord[] findByCaller(String caller) {
		
		List<MobileCallRecord> callRecordsList = mobileCallRecordsRepository.findByCallerMSISDN(caller);
		
		return callRecordsList.toArray(new MobileCallRecord[callRecordsList.size()]);
	}


	public MobileCallRecord[] findByReceiver(String receiver) {
		
		List<MobileCallRecord> callRecordsList = mobileCallRecordsRepository.findByReceiverMSISDN(receiver);
		
		return callRecordsList.toArray(new MobileCallRecord[callRecordsList.size()]);
	}

	
	public MobileCallRecord[] findByCallerOrReceiver(String caller, String receiver) {
		
		List<MobileCallRecord> callRecordsList = mobileCallRecordsRepository.findByCallerMSISDNOrReceiverMSISDN(caller, receiver);
		
		return callRecordsList.toArray(new MobileCallRecord[callRecordsList.size()]);
	}

}
