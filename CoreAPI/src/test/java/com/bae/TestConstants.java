package com.bae;

import java.sql.Timestamp;
import java.time.LocalDate;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.bae.domain.Associate;
import com.bae.domain.Citizen;
import com.bae.domain.MobileCallRecords;
import com.bae.domain.PeopleMobile;
import com.bae.domain.VehicleLocations;
import com.bae.domain.VehicleRegistration;

public class TestConstants {

	//Citizen Controller Test
	public static final Citizen MOCK_CITIZEN = new Citizen(12348L, "Crazy", "Ivan",
			"543 Crazy Street, Crazy Town, CR 4ZY", LocalDate.of(1990, 01, 01), "Russiatown", "Male");


	public static final String CITIZEN_FORENAME = "http://citizen:8003/getCitizensByForenames/Crazy";
	public static final String CITIZEN_SURNAME = "http://citizen:8003/getCitizensBySurname/Ivan";
	public static final String CITIZEN_FULLNAME = "http://citizen:8003/getCitizensByFullname/Crazy/Ivan";
	public static final String CITIZEN_FULLNAME_AND_ADDRESS = "http://citizen:8003/getCitizensByFullnameAndAddress/Crazy/Ivan/543 Crazy Street, Crazy Town, CR 4ZY";

	public static final Citizen[] MOCK_CITIZEN_ARRAY = { MOCK_CITIZEN };

	public static final ResponseEntity<Citizen[]> MOCK_CITIZEN_RESPONSE = new ResponseEntity<Citizen[]>(
			MOCK_CITIZEN_ARRAY, HttpStatus.OK);

	//Car Controller Test
	public static final String VEHICLE_LOCATION = "http://vehicle:8004/getLocationsByRegistrationNo/CRA 55Y";
	public static final String VEHICLE_REGISTRATION = "http://vehicle:8004/getVehiclesByRegistrationNo/CRA 55Y";
	
	public static final VehicleLocations[] MOCK_VEHICLE_LOCATION = { new VehicleLocations(2L, 10L,
			new Timestamp(System.currentTimeMillis()), "CRA 55Y", "Crazy Street", 0.00000, 0.000000) };
	public static final ResponseEntity<VehicleLocations[]> MOCK_VEHICLE_LOCATION_RESPONSE = new ResponseEntity<VehicleLocations[]>(MOCK_VEHICLE_LOCATION, HttpStatus.OK);
	
	public static final VehicleRegistration[] MOCK_VEHICLE_REGISTRATION = {
			new VehicleRegistration(10L, LocalDate.of(2001, 01, 01), "CRA 55Y", "bike", "scooter", "pink", "Crazy",
					"Ivan", "543 Crazy Street, Crazy Town, CR 4ZY", LocalDate.of(1990, 01, 01), "CRAZY1") };
	public static final ResponseEntity<VehicleRegistration[]> MOCK_VEHICLE_REG_RESPONSE = new ResponseEntity<VehicleRegistration[]>(MOCK_VEHICLE_REGISTRATION, HttpStatus.OK);
	
	
	//Associate Controller Test
	public static final Associate MOCK_ASSOCIATE = new Associate(
			"John", 
			"Smith", 
			"16 HIGH ROAD, UPFORD, U43 2DX"
			);
	
	public static final String ASSOCIATE_FULLNAME_AND_ADDRESS = "http://associates:8007/getAssociatesByFullNameAndAddress/John/Smith/16 HIGH ROAD, UPFORD, U43 2DX";

	public static final String ASSOCIATE_PHONENUMBER = "http://associates:8007/getAssociatesByPhoneNumber/01234 567890";

	
	public static final Associate[] MOCK_ASSOCIATE_ARRAY = {MOCK_ASSOCIATE};
	
	public static final ResponseEntity<Associate[]> MOCK_ASSOCIATE_RESPONSE = new ResponseEntity<Associate[]>(
			MOCK_ASSOCIATE_ARRAY, HttpStatus.OK);
	
	//Mobile Controller Test
	
	public static final PeopleMobile MOCK_PEOPLE_MOBILE = new PeopleMobile(
			1, "Aaron", "Aarvark", LocalDate.of(1978, 5, 01), "34 Megaroad Megatown M6 7RQ", "01234567890", "Megafone"
			);
	
	public static final PeopleMobile[] MOCK_PEOPLE_MOBILE_ARRAY = {MOCK_PEOPLE_MOBILE};
	
	public static final MobileCallRecords MOCK_CALL_RECORD = 
			new MobileCallRecords(1, Timestamp.valueOf("2018-08-22 10:10:10"), "01234567890", "1", "08123456781", "2");
	
	public static final MobileCallRecords[] MOCK_CALL_RECORD_ARRAY = {MOCK_CALL_RECORD};
	
	public static final ResponseEntity<PeopleMobile[]> MOCK_PEOPLE_MOBILE_RESPONSE = 
			new ResponseEntity<>(MOCK_PEOPLE_MOBILE_ARRAY, HttpStatus.OK);
	
	public static final ResponseEntity<MobileCallRecords[]> MOCK_CALL_RECORD_RESPONSE = 
			new ResponseEntity<>(MOCK_CALL_RECORD_ARRAY, HttpStatus.OK);
	
	public static final String PEOPLE_MOBILE_FULLNAME_AND_ADDRESS = "http://mobile:8006/getCallRecordsByCaller/Aaron/Aarvark/34 Megaroad Megatown M6 7RQ";

	public static final String CALL_RECORDS_PHONENUMBER = "http://mobile:8006/getMobileByFullnameAndAddress/01234567890";

	
}
