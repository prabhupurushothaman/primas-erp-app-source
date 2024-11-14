package com.primas.branch.entity;

import com.primas.branch.util.PrimasBranchConstants;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = PrimasBranchConstants.PRIMAS_BRANCH_MASTER)

public class PrimasBranchMasterEntity {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = PrimasBranchConstants.TXN_ID)
	private long txnId;
	
	@Column(name = PrimasBranchConstants.UNIT_CODE)
	private String unitCode;

	@Column(name = PrimasBranchConstants.STATE_CODE, nullable = false)
	private String stateCode;

	@Column(name = PrimasBranchConstants.BRANCH_CODE, nullable = false)
	private String branchCode;

	@Column(name = PrimasBranchConstants.BRANCH_DESCRIPTION, nullable = false)
	private String branchDescription;

}
