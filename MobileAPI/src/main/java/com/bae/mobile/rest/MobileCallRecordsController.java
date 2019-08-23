package com.bae.mobile.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.bae.mobile.domain.MobileCallRecords;
import com.bae.mobile.service.MobileCallRecordsService;

@RestController
public class MobileCallRecordsController {


	private MobileCallRecordsService callRecordsService;
	
	@Autowired
	public MobileCallRecordsController(MobileCallRecordsService callRecordsService) {

		this.callRecordsService = callRecordsService;
	}
	
	@GetMapping("/getCallRecordsByCaller/{caller}")
	public ResponseEntity<MobileCallRecords[]> findCallRecordsByCaller(@PathVariable("caller") String caller){
		
		return new ResponseEntity<MobileCallRecords[]>(callRecordsService.findByCaller(caller), HttpStatus.OK);
		
	}
	
	@GetMapping("/getCallRecordsByReceiver/{receiver}")
	public ResponseEntity<MobileCallRecords[]> findCallRecordsByReceiver(@PathVariable("receiver") String receiver){
		
		return new ResponseEntity<MobileCallRecords[]>(callRecordsService.findByReceiver(receiver), HttpStatus.OK);
		
	}
	
	@GetMapping("/getCallRecordsByCallerOrReceiver/{caller}/{receiver}")
	public ResponseEntity<MobileCallRecords[]> findCallRecordsByCallerOrReceiver(@PathVariable("caller") String caller, @PathVariable("receiver") String receiver){
		
		return new ResponseEntity<MobileCallRecords[]>(callRecordsService.findByCallerOrReceiver(caller, receiver), HttpStatus.OK);
		
	}
	
}
