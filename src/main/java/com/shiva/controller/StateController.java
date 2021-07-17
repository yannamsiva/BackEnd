package com.shiva.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shiva.service.SsnService;

@RestController
public class StateController {

	@Autowired
	private SsnService ssnService;
	
	
	@GetMapping(value = {"/","/register"})
	public List<String> loadForm()
	{
		List<String> states=ssnService.getAllStateNames();
		return ssnService.getAllStateNames();
		
	}
}
