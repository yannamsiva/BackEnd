package com.shiva.service.impl;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shiva.entity.SsnEntrollMentEntity;
import com.shiva.model.SsnEntrollment;
import com.shiva.repo.SsnMasterRepository;
import com.shiva.repo.StateMasterRepository;
import com.shiva.service.SsnService;

@Service
public class SsnServiceImpl implements SsnService {

	@Autowired
	private SsnMasterRepository ssnRepo;
	
	@Autowired
	private StateMasterRepository stateRepo;
	
	@Override
	public List<String> getAllStateNames() {
		// TODO Auto-generated method stub
		List<String> stateNames=stateRepo.findByStateNames();
		return null;
	}

	@Override
	public Long SsnEntrollMent(SsnEntrollment req) {
		// TODO Auto-generated method stub
		SsnEntrollMentEntity entity=new SsnEntrollMentEntity();
		BeanUtils.copyProperties(req, entity);
		SsnEntrollMentEntity savedEntity=ssnRepo.save(entity);
		if(savedEntity!=null)
			return savedEntity.getSsn();
		return null;
	}

	@Override
	public String checkEntrollment(Long ssn, String stateName) {
		// TODO Auto-generated method stub
		SsnEntrollMentEntity entity=ssnRepo.findBySsnAndStateName(ssn, stateName);
		if(entity!=null)
			return "VALID";
		else
		return "IN-VALID";
	}

}
