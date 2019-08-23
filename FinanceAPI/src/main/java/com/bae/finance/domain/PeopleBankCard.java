package com.bae.finance.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PeopleBankCard {



	@Id
	@Column(name = "bankaccountid")
	private Long bankAccountId;
	@Column(name = "forenames")
	private String forenames;
	@Column(name = "surname")
	private String surname;
	@Column(name = "accountno")
	private String accountNo;
	@Column(name = "bank")
	private String bank;
	@Column(name = "cardNumber")
	private String cardNumber;
	@Column(name = "sortcode")
	private String sortCode;
	@Column(name = "homeaddress")
	private String homeAddress;
	
	public PeopleBankCard() {
		
	}
	
	public PeopleBankCard(Long bankAccountId, String forenames, String surname, String accountNo, String bank,
			String cardNumber, String sortCode, String homeAddress) {
		super();
		this.bankAccountId = bankAccountId;
		this.forenames = forenames;
		this.surname = surname;
		this.accountNo = accountNo;
		this.bank = bank;
		this.cardNumber = cardNumber;
		this.sortCode = sortCode;
		this.homeAddress = homeAddress;
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
	
	
	
}
