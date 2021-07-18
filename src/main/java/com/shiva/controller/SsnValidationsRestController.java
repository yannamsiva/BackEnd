package com.shiva.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.shiva.service.SsnService;

@RestController
public class SsnValidationsRestController {

	@Autowired
	private SsnService ssnService;
	
	@GetMapping(value = "/verify/{sn}/{stateName}")
	ResponseEntity<String> verify(@PathVariable("sn")    Long sn,@PathVariable("stateName")   String stateName)
	{
		
		String status=ssnService.checkEntrollment(sn, stateName);
		ResponseEntity<String>response=new ResponseEntity<>(status,HttpStatus.OK);
		return response;
	}
	
@GetMapping("/welcome")
	public String getWelcome()
	{
		return "Welcome Boss";
	}
}
