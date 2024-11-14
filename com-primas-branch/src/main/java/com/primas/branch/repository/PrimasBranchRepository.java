package com.primas.branch.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.primas.branch.entity.PrimasBranchMasterEntity;

@Repository
public interface PrimasBranchRepository extends JpaRepository<PrimasBranchMasterEntity, Long>{

	//PrimasUnitMasterEntity findByName(String name);
	
	Optional<PrimasBranchMasterEntity> findByBranchCode(String countryCode);
}
