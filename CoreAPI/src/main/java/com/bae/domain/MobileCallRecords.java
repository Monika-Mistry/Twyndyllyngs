package com.bae.domain;

import java.sql.Timestamp;


public class MobileCallRecords {

	private int id;

	private Timestamp timestamp;

	private String callerMSISDN;

	private String callCellTowerId;

	private String receiverMSISDN;

	private String receiverTowerId;
	
	
	public MobileCallRecords() {
		
	}
	
	public MobileCallRecords(int id, Timestamp timestamp, String callerMSISDN, String callCellTowerId,
			String receiverMSISDN, String receiverTowerId) {
		this.id = id;
		this.timestamp = timestamp;
		this.callerMSISDN = callerMSISDN;
		this.callCellTowerId = callCellTowerId;
		this.receiverMSISDN = receiverMSISDN;
		this.receiverTowerId = receiverTowerId;
	}
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
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
