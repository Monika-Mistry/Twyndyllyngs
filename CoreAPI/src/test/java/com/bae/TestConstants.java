package com.bae;

import java.time.LocalDate;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.bae.domain.Citizen;
import com.bae.domain.User;

public class TestConstants {
	
	public static final Citizen MOCK_CITIZEN = new Citizen(12348L, "Crazy", "Ivan", "543 Crazy Street, Crazy Town, CR 4ZY", LocalDate.of(1990, 01, 01), "Russiatown", "Male");
	
	public static final String CITIZEN_FORENAME = "http://citizen:8003/getCitizensByForenames/user/Crazy";
	public static final String CITIZEN_SURNAME = "http://citizen:8003/getCitizensBySurname/user/Ivan";
	public static final String CITIZEN_FULLNAME = "http://citizen:8003/getCitizensByFullname/user/Crazy/Ivan";
	public static final String CITIZEN_ID = "http://citizen:8003/getCitizenById/user/" + 12348L;
	
	
	public static final User MOCK_EMPTY_USER = new User("", "");
	public static final User MOCK_NULL_USER = new User();
	public static final User MOCK_USER = new User("user", "user");
	
	public static final ResponseEntity<User> MOCK_CREATE_USER_RESPONSE = new ResponseEntity<User>(MOCK_USER, HttpStatus.CREATED);
	public static final ResponseEntity<String> MOCK_FAIL_LOGIN_RESPONSE = new ResponseEntity<String>("Invalid login credentials",
			HttpStatus.PRECONDITION_FAILED);
	public static final ResponseEntity<String> MOCK_LOGIN_RESPONSE = new ResponseEntity<String>("User Logged In", HttpStatus.OK);
	
	public static final String MOCK_DELETE_USER_URL = "http://login:8002/deleteUser/" + 1L;
	
	public static final String MOCK_SUCCESS = "Success";

}
