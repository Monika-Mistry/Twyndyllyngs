package com.bae.mobile.service;

import com.bae.mobile.domain.MobileCallRecords;

public interface MobileCallRecordService {
	
	MobileCallRecords[] findByCaller(String caller);
	
	MobileCallRecords[] findByReceiver(String receiver);
	
	MobileCallRecords[] findByCallerOrReceiver(String caller, String receiver);
}
