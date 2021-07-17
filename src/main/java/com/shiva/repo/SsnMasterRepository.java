package com.shiva.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.shiva.entity.SsnEntrollMentEntity;

@Repository
public interface SsnMasterRepository extends JpaRepository<SsnEntrollMentEntity,Long> {

	@Query("from SsnEntrollMentEntity where ssn=:ssn and stateName=:stateName")
	public SsnEntrollMentEntity findBySsnAndStateName(Long ssn,String stateName);
}
