package com.bae.mobile.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.bae.mobile.domain.MobileCallRecord;
import com.bae.mobile.service.MobileCallRecordService;

@RestController
public class MobileCallRecordController {


	private MobileCallRecordService callRecordsService;
	
	@Autowired
	public MobileCallRecordController(MobileCallRecordService callRecordsService) {

		this.callRecordsService = callRecordsService;
	}
	
	@GetMapping("/getCallRecordsByCaller/{caller}")
	public ResponseEntity<MobileCallRecord[]> findCallRecordsByCaller(@PathVariable("caller") String caller){
		
		return new ResponseEntity<>(callRecordsService.findByCaller(caller), HttpStatus.OK);
		
	}
	
	@GetMapping("/getCallRecordsByReceiver/{receiver}")
	public ResponseEntity<MobileCallRecord[]> findCallRecordsByReceiver(@PathVariable("receiver") String receiver){
		
		return new ResponseEntity<>(callRecordsService.findByReceiver(receiver), HttpStatus.OK);
		
	}
	
	@GetMapping("/getCallRecordsByCallerOrReceiver/{caller}/{receiver}")
	public ResponseEntity<MobileCallRecord[]> findCallRecordsByCallerOrReceiver(@PathVariable("caller") String caller, @PathVariable("receiver") String receiver){
		
		return new ResponseEntity<>(callRecordsService.findByCallerOrReceiver(caller, receiver), HttpStatus.OK);
		
	}
	
}
