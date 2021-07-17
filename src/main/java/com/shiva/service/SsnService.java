package com.shiva.service;

import java.util.List;

import com.shiva.model.SsnEntrollment;

public interface SsnService {

	public List<String> getAllStateNames();
	public Long SsnEntrollMent(SsnEntrollment req);
	public String checkEntrollment(Long ssn,String stateName);
}
