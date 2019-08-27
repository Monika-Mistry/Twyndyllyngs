package com.bae.rest;

public class Constants {
	
	public static final String VEHICLE_LOCATION_URL = "http://vehicle:8004/getLocationsByRegistrationNo/";
	public static final String VEHICLE_REGISTRATION_URL = "http://vehicle:8004/getVehiclesByRegistrationNo/";

	public static final String CITIZEN_FORENAME_URL = "http://citizen:8003/getCitizensByForenames/";
	public static final String CITIZEN_SURNAME_URL = "http://citizen:8003/getCitizensBySurname/";
	public static final String CITIZEN_FULLNAME_URL = "http://citizen:8003/getCitizensByFullname/";
	public static final String CITIZEN_FULLNAME_AND_ADDRESS_URL = "http://citizen:8003/getCitizensByFullnameAndAddress/";
	public static final String CITIZEN_ID_URL = "http://citizen:8003/getCitizenById/";
	
	public static final String ASSOCIATE_FULLNAME_ADDRESS_URL = "http://associates:8007/getAssociatesByFullNameAndAddress/";
	public static final String ASSOCIATE_PHONE_NUMBER_URL = "http://associates:8007/getAssociatesByPhoneNumber/";
	
	public static final String MOBILE_CALL_RECORDS_URL = "http://mobile:8006/getCallRecordsByCaller/";
	public static final String PEOPLE_MOBILE_URL = "http://mobile:8006/getMobileByFullnameAndAddress/";
}
