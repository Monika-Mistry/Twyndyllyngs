package com.bae.mobile.service;

import com.bae.mobile.domain.MobileCallRecord;

public interface MobileCallRecordService {
	
	MobileCallRecord[] findByCaller(String caller);
	
	MobileCallRecord[] findByReceiver(String receiver);
	
	MobileCallRecord[] findByCallerOrReceiver(String caller, String receiver);
}
