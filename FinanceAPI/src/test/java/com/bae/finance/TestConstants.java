package com.bae.finance;

import java.sql.Timestamp;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.bae.finance.domain.AtmTransactionLocations;
import com.bae.finance.domain.EposTransactionLocations;
import com.bae.finance.domain.PeopleBankCard;

public class TestConstants {

	public static final PeopleBankCard MOCK_BANK_ACCOUNT_1 = new PeopleBankCard(12345678L, "Aaron" , "Aarvark" , "123456", 
			"Mega Bank", "1234567891234567", "10-07-73" , "34 Megaroad Megatown M6 7RQ", LocalDate.of(1990, 01, 01));

	public static final PeopleBankCard[] MOCK_BANK_ACCOUNT_ARRAY = {MOCK_BANK_ACCOUNT_1};


	public static final ResponseEntity<PeopleBankCard[]> MOCK_BANK_ACCOUNT_RESPONSE = new ResponseEntity<PeopleBankCard[]>(MOCK_BANK_ACCOUNT_ARRAY, HttpStatus.OK);

 	
	
	
	public static final AtmTransactionLocations MOCK_ATM_TRANSACTIONS = new AtmTransactionLocations(1L, "Cash Withdrawal", 100, 1L, Timestamp.valueOf("2019-08-27 10:10:10.0"), 
			"Natwest", "Megaroad", "M6 7RQ", 0.666666, 0.666666, 1L, "Aaron" , "Aarvark" , "1", LocalDate.of(1990, 01, 01), "34 Megaroad Megatown M6 7RQ",
			"1234567891234567");
	
	public static final AtmTransactionLocations[] MOCK_ATM_TRANSACTION_ARRAY = {MOCK_ATM_TRANSACTIONS};
	
	public static final ResponseEntity<AtmTransactionLocations[]> MOCK_ATM_TRANSACTION_RESPONSE = new ResponseEntity<AtmTransactionLocations[]>
	(MOCK_ATM_TRANSACTION_ARRAY, HttpStatus.OK);

	
	
	
	public static final EposTransactionLocations MOCK_EPOS_TRANSACTIONS = new EposTransactionLocations(1L, 1L, "123456", "Aaron" , "Aarvark",
			LocalDate.of(1990, 01, 01), "34 Megaroad Megatown M6 7RQ", "1234567891234567", Timestamp.valueOf("2019-08-27 10:10:10.0"), 37.89,
			1234L, "Builder", "Megaroad", "M6 7RQ", 0.666666, 0.666666);
		
	
	public static final EposTransactionLocations[] MOCK_EPOS_TRANSACTION_ARRAY = {MOCK_EPOS_TRANSACTIONS};
	
	public static final ResponseEntity<EposTransactionLocations[]> MOCK_EPOS_TRANSACTION_RESPONSE = new ResponseEntity<EposTransactionLocations[]>
	(MOCK_EPOS_TRANSACTION_ARRAY, HttpStatus.OK);
	
	



}
