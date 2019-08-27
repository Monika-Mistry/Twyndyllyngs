package com.bae.domain;

import java.time.LocalDate;

public class PeopleBankCard {

	private Long bankAccountId;
	private String forenames;
	private String surname;
	private String accountNo;
	private String bank;
	private String cardNumber;
	private String sortCode;
	private String homeAddress;
	private LocalDate dateOfBirth;
	
	public PeopleBankCard() {
		
	}
	
	public PeopleBankCard(Long bankAccountId, String forenames, String surname, String accountNo, String bank,
			String cardNumber, String sortCode, String homeAddress, LocalDate dateOfBirth) {
		super();
		this.bankAccountId = bankAccountId;
		this.forenames = forenames;
		this.surname = surname;
		this.accountNo = accountNo;
		this.bank = bank;
		this.cardNumber = cardNumber;
		this.sortCode = sortCode;
		this.homeAddress = homeAddress;
		this.dateOfBirth = dateOfBirth;
	}

	
	
	public Long getBankAccountId() {
		return bankAccountId;
	}

	public void setBankAccountId(Long bankAccountId) {
		this.bankAccountId = bankAccountId;
	}

	public String getForenames() {
		return forenames;
	}

	public void setForenames(String forenames) {
		this.forenames = forenames;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getBank() {
		return bank;
	}

	public void setBank(String bank) {
		this.bank = bank;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getSortCode() {
		return sortCode;
	}

	public void setSortCode(String sortCode) {
		this.sortCode = sortCode;
	}

	public String getHomeAddress() {
		return homeAddress;
	}

	public void setHomeAddress(String homeAddress) {
		this.homeAddress = homeAddress;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	
	
}
