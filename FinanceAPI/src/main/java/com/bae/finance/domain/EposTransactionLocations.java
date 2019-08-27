package com.bae.finance.domain;

import java.sql.Timestamp;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class EposTransactionLocations {



	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "bankaccountid")
	private Long bankAccountId;
	@Column(name = "accountno")
	private String accountNo;
	@Column(name = "forenames")
	private String forenames;
	@Column(name = "surname")
	private String surname;
	@Column(name = "dateofbirth")
	private LocalDate dateOfBirth;
	@Column(name = "homeaddress")
	private String homeAddress;
	@Column(name = "cardnumber")
	private String cardNumber;
	@Column(name = "timestamp")
	private Timestamp timestamp;
	@Column(name = "amount")
	private Double amount;
	@Column(name = "eposid")
	private Long eposId;
	@Column(name = "vendor")
	private String vendor;
	@Column(name = "streetname")
	private String streetName;
	@Column(name = "postcode")
	private String postcode;
	@Column(name = "latitude")
	private Double latitude;
	@Column(name = "longitude")
	private Double longitude;

	public EposTransactionLocations() {
		
	}
	
	public EposTransactionLocations(Long id, Long bankAccountId, String accountNo, String forenames, String surname,
			LocalDate dateOfBirth, String homeAddress, String cardNumber, Timestamp timestamp, Double amount,
			Long eposId, String vendor, String streetName, String postcode, Double latitude, Double longitude) {
		super();
		this.id = id;
		this.bankAccountId = bankAccountId;
		this.accountNo = accountNo;
		this.forenames = forenames;
		this.surname = surname;
		this.dateOfBirth = dateOfBirth;
		this.homeAddress = homeAddress;
		this.cardNumber = cardNumber;
		this.timestamp = timestamp;
		this.amount = amount;
		this.eposId = eposId;
		this.vendor = vendor;
		this.streetName = streetName;
		this.postcode = postcode;
		this.latitude = latitude;
		this.longitude = longitude;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getBankAccountId() {
		return bankAccountId;
	}

	public void setBankAccountId(Long bankAccountId) {
		this.bankAccountId = bankAccountId;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
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

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getHomeAddress() {
		return homeAddress;
	}

	public void setHomeAddress(String homeAddress) {
		this.homeAddress = homeAddress;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public Timestamp getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Timestamp timestamp) {
		this.timestamp = timestamp;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public Long getEposId() {
		return eposId;
	}

	public void setEposId(Long eposId) {
		this.eposId = eposId;
	}

	public String getVendor() {
		return vendor;
	}

	public void setVendor(String vendor) {
		this.vendor = vendor;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getPostcode() {
		return postcode;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public Double getLongitude() {
		return longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}
	
	
	
	
}
