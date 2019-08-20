package com.bae;

import java.time.LocalDate;

import com.bae.domain.Citizen;

public class TestConstants {
	
	public static final Citizen MOCK_CITIZEN = new Citizen(12348L, "Crazy", "Ivan", "543 Crazy Street, Crazy Town, CR 4ZY", LocalDate.of(1990, 01, 01), "Russiatown", "Male");
	
	public static final String CITIZEN_FORENAME = "http://citizen:8003/getCitizensByForenames/user/Crazy";
	public static final String CITIZEN_SURNAME = "http://citizen:8003/getCitizensBySurname/user/Ivan";
	public static final String CITIZEN_FULLNAME = "http://citizen:8003/getCitizensByFullname/user/Crazy/Ivan";
	public static final String CITIZEN_ID = "http://citizen:8003/getCitizenById/user/" + 12348L;

}
