package com.bae.associate.repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.bae.associate.domain.Associate;
import com.bae.associate.domain.PeopleMobile;

public interface AssociateRepository extends CrudRepository<PeopleMobile, Long> {

	
	@Query(value = "SELECT receiver.forenames, receiver.surname, receiver.address, receiver.phoneNumber " + 
			"FROM( " + 
			"SELECT DISTINCT caller.forenames, caller.surname, mcr.receiverMSISDN " + 
			"FROM MobileCallRecords as mcr " + 
			"Join PeopleMobile AS caller " + 
			"ON caller.phoneNumber = mcr.callerMSISDN " + 
			"AND caller.phoneNumber=:phoneNumber  " + 
			") AS numbers " + 
			"JOIN PeopleMobile as receiver " + 
			"ON numbers.receiverMSISDN = receiver.phoneNumber",
			nativeQuery = true)	
	ArrayList<Associate> findAssociatesByPhonenumber(@Param("phoneNumber")String phoneNumber);
	
	@Query(value = "SELECT receiver.forenames, receiver.surname, receiver.address, receiver.phoneNumber " + 
			"FROM( " + 
			"SELECT DISTINCT caller.forenames, caller.surname, mcr.receiverMSISDN " + 
			"FROM MobileCallRecords as mcr " + 
			"Join PeopleMobile AS caller " + 
			"ON caller.phoneNumber = mcr.callerMSISDN " + 
			"AND caller.forenames=:forenames  " + 
			"AND caller.surname=:surname  " + 
			"AND caller.address=:address  " + 
			") AS numbers " + 
			"JOIN PeopleMobile as receiver " + 
			"ON numbers.receiverMSISDN = receiver.phoneNumber",
			nativeQuery = true)	
	ArrayList<Associate> findAssociatesByFullNameAndAddress(@Param("forenames") String forenames, @Param("surname") String surname, @Param("address") String address);

}
