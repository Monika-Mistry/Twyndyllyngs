package com.bae.finance.domain;

import java.sql.Timestamp;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class AtmTransactionLocations {

	@Column(name = "atmid")
	private Long atmId;
	@Column(name = "type")
	private String type;
	@Column(name = "amount")
	private int amount;
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "timestamp")
	private Timestamp timestamp;
	@Column(name = "operator")
	private String operator;
	@Column(name = "streetname")
	private String streetName;
	@Column(name = "postcode")
	private String postcode;
	@Column(name = "latitude")
	private Double latitude;
	@Column(name = "longitude")
	private Double longitude;
	@Column(name = "bankaccountid")
	private Long bankAccountId;
	@Column(name = "accountno")
	private String accountno;
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
	
	
	
	
	public AtmTransactionLocations() {
		super();
	}

	public AtmTransactionLocations(Long atmId, String type, int amount, Long id, Timestamp timestamp, String operator,
			String streetName, String postcode, Double latitude, Double longitude, Long bankAccountId, String accountno,
			String forenames, String surname, LocalDate dateOfBirth, String homeAddress, String cardNumber) {
		super();
		this.atmId = atmId;
		this.type = type;
		this.amount = amount;
		this.id = id;
		this.timestamp = timestamp;
		this.operator = operator;
		this.streetName = streetName;
		this.postcode = postcode;
		this.latitude = latitude;
		this.longitude = longitude;
		this.bankAccountId = bankAccountId;
		this.accountno = accountno;
		this.forenames = forenames;
		this.surname = surname;
		this.dateOfBirth = dateOfBirth;
		this.homeAddress = homeAddress;
		this.cardNumber = cardNumber;
	}
	
	public Long getAtmId() {
		return atmId;
	}
	public void setAtmId(Long atmId) {
		this.atmId = atmId;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Timestamp getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Timestamp timestamp) {
		this.timestamp = timestamp;
	}
	public String getOperator() {
		return operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
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
	public Long getBankAccountId() {
		return bankAccountId;
	}
	public void setBankAccountId(Long bankAccountId) {
		this.bankAccountId = bankAccountId;
	}
	public String getAccountno() {
		return accountno;
	}
	public void setAccountno(String accountno) {
		this.accountno = accountno;
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
	
	
	
	
}
