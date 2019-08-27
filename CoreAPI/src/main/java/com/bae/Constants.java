    
package com.bae;

public class Constants {
	
	public static final String CITIZEN_URL = "http://citizen:8003/";
	public static final String CITIZEN_FORENAME_URL = CITIZEN_URL + "getCitizensByForenames/";
	public static final String CITIZEN_SURNAME_URL =  CITIZEN_URL + "getCitizensBySurname/";
	public static final String CITIZEN_FULLNAME_URL =  CITIZEN_URL + "getCitizensByFullname/";
	public static final String CITIZEN_ID_URL =  CITIZEN_URL + "getCitizenById/";
	
	
	public static final String LOGIN_URL = "http://login:8002/";
	public static final String LOGIN_USER_URL =  LOGIN_URL + "loginUser";
	public static final String LOGIN_CREATE_URL =  LOGIN_URL + "createUser";
	public static final String LOGIN_DELETE_URL =  LOGIN_URL + "deleteUser/";

}
