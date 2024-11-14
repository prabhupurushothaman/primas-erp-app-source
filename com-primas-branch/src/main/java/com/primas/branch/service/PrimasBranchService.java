package com.primas.branch.service;

import com.primas.branch.dto.PrimasBranchMasterDto;

public interface PrimasBranchService {
	PrimasBranchMasterDto createBranch(PrimasBranchMasterDto primasBranchMasterDto);

	PrimasBranchMasterDto getBranchById(Long id);

	PrimasBranchMasterDto updateBranch(PrimasBranchMasterDto primasBranchMasterDto, Long id);

	void deleteBranch(Long id);

}
