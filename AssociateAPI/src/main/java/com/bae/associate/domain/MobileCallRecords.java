package com.bae.associate.domain;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class MobileCallRecords {
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "timestamp")
	private Timestamp timestamp;
	@Column(name = "callermsisdn")
	private String callerMSISDN;
	@Column(name = "callcelltowerid")
	private String callCellTowerId;
	@Column(name="receivermsisdn")
	private String receiverMSISDN;
	@Column(name = "receivertowerid")
	private String receiverTowerId;
	
	public MobileCallRecords(Long id, Date timestamp, String callerMSISDN, String callCellTowerId,
			String receiverMSISDN, String receiverTowerId) {
		super();
		this.id = id;
		this.timestamp = timestamp;
		this.callerMSISDN = callerMSISDN;
		this.callCellTowerId = callCellTowerId;
		this.receiverMSISDN = receiverMSISDN;
		this.receiverTowerId = receiverTowerId;
	}
	
	public MobileCallRecords() {
		super();
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
	public String getCallerMSISDN() {
		return callerMSISDN;
	}
	public void setCallerMSISDN(String callerMSISDN) {
		this.callerMSISDN = callerMSISDN;
	}
	public String getCallCellTowerId() {
		return callCellTowerId;
	}
	public void setCallCellTowerId(String callCellTowerId) {
		this.callCellTowerId = callCellTowerId;
	}
	public String getReceiverMSISDN() {
		return receiverMSISDN;
	}
	public void setReceiverMSISDN(String receiverMSISDN) {
		this.receiverMSISDN = receiverMSISDN;
	}
	public String getReceiverTowerId() {
		return receiverTowerId;
	}
	public void setReceiverTowerId(String receiverTowerId) {
		this.receiverTowerId = receiverTowerId;
	}

	
	
	
}
