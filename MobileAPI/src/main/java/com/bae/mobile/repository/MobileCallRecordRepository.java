package com.bae.mobile.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bae.mobile.domain.MobileCallRecords;

@Repository
public interface MobileCallRecordRepository extends CrudRepository<MobileCallRecords, Integer>{

	public List<MobileCallRecords> findByCallerMSISDN(String callerMSISDN);
	
	public List<MobileCallRecords> findByReceiverMSISDN(String receiverMSISDN);
	
	public List<MobileCallRecords> findByCallerMSISDNOrReceiverMSISDN(String callerMSISDN, String receiverMSISDN);
}
