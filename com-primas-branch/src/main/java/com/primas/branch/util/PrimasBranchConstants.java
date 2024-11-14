package com.primas.branch.util;

public interface PrimasBranchConstants {

	//Branch
	public static final String TXN_ID = "TXN_ID";


	public static final String UNIT_CODE = "UNIT_CODE" ;
	public static final String PRIMAS_BRANCH_MASTER = "PRIMAS_BRANCH_MASTER";
	public static final String BRANCH_CODE = "BRANCH_CODE";
	public static final String BRANCH_DESCRIPTION = "BRANCH_DESCRIPTION";

	public static final String UNIT_CODE_EMPTY_MSG = "Unit Code should not be empty";
	public static final String BRANCH_CODE_EMPTY_MSG = "Branch Code should not be empty";
	public static final String BRANCH_DESCRIPTION_EMPTY_MSG = "Branch Description Code should not be empty";

	public static final String STATE_CODE_BLANK_MSG = "State Code is mandatory";
	public static final String STATE_CODE_EMPTY_MSG = "State Code should not be empty";
	public static final String STATE_DESCRIPTION_EMPTY_MSG = "State Description should not be empty";

	public static final String PRIMAS_STATE_MASTER = "PRIMAS_STATE_MASTER";

	public static final String COUNTRY_CODE = "COUNTRY_CODE";
	public static final String STATE_CODE = "STATE_CODE";
	public static final String STATE_DESCRIPTION = "STATE_DESCRIPTION";

	//public static final String BRANCH_NOT_FOUND = "BRANCH_NOT_FOUND";

	public static final String PRIMAS_BRANCH_ALREADY_EXISTS = "PRIMAS_BRANCH_ALREADY_EXISTS";
	public static final String BRANCH_ALREADY_EXIST_MSG = "Primas Branch already exist";
	public static final String BRANCH_ALREADY_EXIST_CODE = "BRANCH_ALREADY_EXIST";

	public static final String UNIT_CODE_MIN_LENGTH_ERROR_MSG = "Unit Code Minimum length should be 4 characters";
	public static final String UNIT_CODE_MAX_LENGTH_ERROR_MSG = "Unit Code Maximum should not exceed 4 characters";
	public static final String UNIT_CODE_ALLOWED_CHARS_ERROR_MSG = "Unit Code must be of 4 to 4 length with no Special Characters";


	public static final String STATE_CODE_MIN_LENGTH_ERROR_MSG = "State Code Minimum length should be 4 characters";
	public static final String STATE_CODE_MAX_LENGTH_ERROR_MSG = "State Code Maximum should not exceed 4 characters";
	public static final String STATE_CODE_ALLOWED_CHARS_ERROR_MSG = "State Code must be of 4 to 4 length with no Special Characters";

	public static final String BRANCH_CODE_MIN_LENGTH_ERROR_MSG = "Branch Code Minimum length should be 4 characters";
	public static final String BRANCH_CODE_MAX_LENGTH_ERROR_MSG = "Branch Code Maximum should not exceed 4 characters";
	public static final String BRANCH_CODE_ALLOWED_CHARS_ERROR_MSG = "Branch Code must be of 4 to 4 length with no Special Characters";

	public static final String BRANCH_DESCRIPTION_MIN_LENGTH_ERROR_MSG = "Branch Description Minimum length should be 4 characters";
	public static final String BRANCH_DESCRIPTION_MAX_LENGTH_ERROR_MSG = "Branch Description Maximum should not exceed 25 characters";
	public static final String BRANCH_DESCRIPTION_ALLOWED_CHARS_ERROR_MSG = "Branch Description must be of 4 to 25 length with no Special Characters";

	public static final String REQUEST_MAPPING = "/api/branches";

	public static final String GET_MAPPING_WELCOME_BRANCH = "welcome-branch";

	public static final String WELCOME_TEXT = "Welcome to Primas Branch Details";

	public static final String GET_MAPPING_ID = "/{id}";

	public static final String MAPPING_ID = "/{id}";

	public static final String SMALL_ID = "id";

	public static final String BRANCH_NOT_FOUND = "BRANCH_NOT_FOUND";

	public static final String BRANCH = "BRANCH";

	public static final String UNIT_NOT_FOUND = "UNIT_NOT_FOUND";

	public static final String DELETE_BRANCH_SUCCESS_MSG = "Branch details deleted successfully.";

	public static final String UNIT = "Unit";

	public static final String HYPEN = "-";

	public static final String SPACE = " ";

	public static final String NOT_FOUND = "Not Found ";

	public static final String PRIMAS_UNIT_ALREADY_EXISTS = "PRIMAS_UNIT_ALREADY_EXISTS";

	public static final String ALPHA_NUMBER_REG_EXP = "^[a-zA-Z0-9]{4,4}$" ;
}