package com.shiva.model;

import java.util.Date;

import lombok.Data;

@Data
public class SsnEntrollment {
	private long ssn;
	private String fname;
	private String lname;
	private String gender;
	private Date dob;
	private String stateName;
	
}
