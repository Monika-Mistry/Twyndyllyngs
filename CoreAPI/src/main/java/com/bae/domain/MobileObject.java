package com.bae.domain;

public class MobileObject {
	
	private MobileCallRecords[] mobileCallRecord;
	private PeopleMobile[] peopleMobile;
	public MobileCallRecords[] getMobileCallRecord() {
		return mobileCallRecord;
	}
	
	
	public MobileObject() {
		super();
	}

	public MobileObject(MobileCallRecords[] mobileCallRecord, PeopleMobile[] peopleMobile) {
		super();
		this.mobileCallRecord = mobileCallRecord;
		this.peopleMobile = peopleMobile;
	}


	public void setMobileCallRecord(MobileCallRecords[] mobileCallRecord) {
		this.mobileCallRecord = mobileCallRecord;
	}
	public PeopleMobile[] getPeopleMobile() {
		return peopleMobile;
	}
	public void setPeopleMobile(PeopleMobile[] peopleMobile) {
		this.peopleMobile = peopleMobile;
	}
	
	

}
