package com.primas.branch.dto;

import com.primas.branch.util.PrimasBranchConstants;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;


@Data

public class PrimasBranchMasterDto {

	private long txnId;
	
	//@NotEmpty(message = PrimasConstants.UNIT_CODE_EMPTY_MSG)
	@NotEmpty(message = PrimasBranchConstants.UNIT_CODE_EMPTY_MSG)
	@Size(min = 4 , message = PrimasBranchConstants.UNIT_CODE_MIN_LENGTH_ERROR_MSG)
	@Size(max = 4 , message = PrimasBranchConstants.UNIT_CODE_MAX_LENGTH_ERROR_MSG)
	//@Pattern(regexp = PrimasBranchConstants.ALPHA_NUMBER_REG_EXP, message = PrimasBranchConstants.UNIT_CODE_ALLOWED_CHARS_ERROR_MSG)
	private String unitCode;

	@NotEmpty(message = PrimasBranchConstants.STATE_CODE_EMPTY_MSG)
	@Size(min = 4 , message = PrimasBranchConstants.STATE_CODE_MIN_LENGTH_ERROR_MSG)
	@Size(max = 4 , message = PrimasBranchConstants.STATE_CODE_MAX_LENGTH_ERROR_MSG)
	//@Pattern(regexp = PrimasBranchConstants.ALPHA_NUMBER_REG_EXP, message = PrimasBranchConstants.UNIT_CODE_ALLOWED_CHARS_ERROR_MSG)
	private String stateCode;

	@NotEmpty(message = PrimasBranchConstants.BRANCH_CODE_EMPTY_MSG)
	@Size(min = 4 , message = PrimasBranchConstants.BRANCH_CODE_MIN_LENGTH_ERROR_MSG)
	@Size(max = 4 , message = PrimasBranchConstants.BRANCH_CODE_MAX_LENGTH_ERROR_MSG)
	//@Pattern(regexp = PrimasBranchConstants.ALPHA_NUMBER_REG_EXP, message = PrimasBranchConstants.UNIT_CODE_ALLOWED_CHARS_ERROR_MSG)
	private String branchCode;

	@NotEmpty(message = PrimasBranchConstants.BRANCH_DESCRIPTION_EMPTY_MSG)
	@Size(min = 4 , message = PrimasBranchConstants.BRANCH_DESCRIPTION_MIN_LENGTH_ERROR_MSG)
	@Size(max = 25 , message = PrimasBranchConstants.BRANCH_DESCRIPTION_MAX_LENGTH_ERROR_MSG)
	//@Pattern(regexp = PrimasBranchConstants.ALPHA_NUMBER_REG_EXP, message = PrimasBranchConstants.UNIT_CODE_ALLOWED_CHARS_ERROR_MSG)
	private String branchDescription;
}
