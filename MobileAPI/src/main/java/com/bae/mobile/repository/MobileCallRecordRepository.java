package com.bae.mobile.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bae.mobile.domain.MobileCallRecord;

@Repository
public interface MobileCallRecordRepository extends CrudRepository<MobileCallRecord, Integer>{

	public List<MobileCallRecord> findByCallerMSISDN(String callerMSISDN);
	
	public List<MobileCallRecord> findByReceiverMSISDN(String receiverMSISDN);
	
	public List<MobileCallRecord> findByCallerMSISDNOrReceiverMSISDN(String callerMSISDN, String receiverMSISDN);
}
