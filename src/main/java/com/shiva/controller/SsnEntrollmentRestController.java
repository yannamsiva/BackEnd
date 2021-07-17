package com.shiva.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.shiva.model.SsnEntrollment;
import com.shiva.service.SsnService;

@RestController
public class SsnEntrollmentRestController {
	@Autowired
	private SsnService ssnService;
	
	@PostMapping(value = "/ssnEntrollment",consumes = "application/json")
	public ResponseEntity<String> entroll(@RequestBody     SsnEntrollment user)
	{
long ssn=		ssnService.SsnEntrollMent(user);
String body="YOUR SSN ENTROLMENT COMPLETED SUCCESSFULLY SSN. YOU SSN :: "+ssn;
ResponseEntity<String> response=null;
response=new ResponseEntity<String>(body,HttpStatus.CREATED);
		return response;
	}

}
