package com.primas.bp.laminar.air.flow.chamber1.log.book.util;

public interface PrimasBpLaminarAirFlowChamber1LogBookConstants {

	//BP Laminar Air Flow Chamber 1 Log Book
	public static final String PRIMAS_BP_LAMINAR_AIR_FLOW_CHAMBER_1_3_LOG_BOOK = "PRIMAS_BP_LAMINAR_AIR_FLOW_CHAMBER_1_3_LOG_BOOK";
	public static final String TXN_ID = "TXN_ID";

	public static final String DATE = "DATE" ;
	public static final String TIME = "TIME";
	public static final String FLASK = "FLASK";
	public static final String UV_DURATION = "UV_DURATION";
	public static final String ACTION= "ACTION";
	public static final String EMP_CODE= "EMP_COE";

	public static final String DATE_BLANK_MSG = "Date is mandatory";
	public static final String DATE_EMPTY_MSG = "Date should not be empty";

	public static final String TIME_BLANK_MSG = "Time is mandatory";
	public static final String TIME_EMPTY_MSG = "Time should not be empty";

	public static final String FLASK_BLANK_MSG = "Flask is mandatory";
	public static final String FLASK_EMPTY_MSG = "Flask should not be empty";

	public static final String UV_DURATION_BLANK_MSG = "UV Duration is mandatory";
	public static final String UV_DURATION_EMPTY_MSG = "UV Duration should not be empty";

	public static final String ACTION_BLANK_MSG = "Action is mandatory";
	public static final String ACTION_EMPTY_MSG = "Action should not be empty";

	public static final String EMP_CODE_BLANK_MSG = "Emp Code is mandatory";
	public static final String EMP_CODE_EMPTY_MSG = "Emp Code should not be empty";

	public static final String DATE_MIN_LENGTH_ERROR_MSG = "Date Minimum length should be 10 characters";
	public static final String DATE_MAX_LENGTH_ERROR_MSG = "Date Maximum should not exceed 10 characters";
	public static final String DATE_ALLOWED_CHARS_ERROR_MSG = "Date must be of 10 characthers length with no Special Characters";

	public static final String TIME_MIN_LENGTH_ERROR_MSG = "Time Minimum length should be 10 characters";
	public static final String TIME_MAX_LENGTH_ERROR_MSG = "Time Maximum should not exceed 10 characters";
	public static final String TIME_ALLOWED_CHARS_ERROR_MSG = "Time must be of 10 characthers length with no Special Characters";

	public static final String FLASK_MIN_LENGTH_ERROR_MSG = "Flask Minimum length should be 10 characters";
	public static final String FLASK_MAX_LENGTH_ERROR_MSG = "Flask Maximum should not exceed 10 characters";
	public static final String FLASK_ALLOWED_CHARS_ERROR_MSG = "Flask must be of 10 characthers length with no Special Characters";

	public static final String UV_DURATION_MIN_LENGTH_ERROR_MSG = "UV Duration Minimum length should be 10 characters";
	public static final String UV_DURATION_MAX_LENGTH_ERROR_MSG = "UV Duration Maximum should not exceed 10 characters";
	public static final String UV_DURATION_ALLOWED_CHARS_ERROR_MSG = "UV Duration must be of 10 characthers length with no Special Characters";

	public static final String ACTION_MIN_LENGTH_ERROR_MSG = "Action Minimum length should be 10 characters";
	public static final String ACTION_MAX_LENGTH_ERROR_MSG = "Action Maximum should not exceed 10 characters";
	public static final String ACTION_ALLOWED_CHARS_ERROR_MSG = "Action must be of 10 characthers length with no Special Characters";

	public static final String EMP_CODE_MIN_LENGTH_ERROR_MSG = "Emp Code Minimum length should be 10 characters";
	public static final String EMP_CODE_MAX_LENGTH_ERROR_MSG = "Emp Code Maximum should not exceed 10 characters";
	public static final String EMP_CODE_ALLOWED_CHARS_ERROR_MSG = "Emp Code must be of 10 characthers length with no Special Characters";

	public static final String REQUEST_MAPPING = "/api/bp/laminator/air/flow/chamber1-log";

	public static final String GET_MAPPING_BP_LAMINATOR_AIR_FLOW_CHAMBER_1_LOG = "welcome-bp-laminator-air-flow-chamber-1-log";

	public static final String MAPPING_ID = "/{id}";

	public static final String GET_MAPPING_ID = "/{id}";

	public static final String SMALL_ID = "id";

	public static final String DELETE_BP_LAMINAR_AIR_FLOW_CHAMBER_1_SUCCESS_MSG = "BP Laminar Air Flow Chamber 1 details deleted successfully.";

	public static final String BP_LAMINAR_AIR_FLOW_CHAMBER_1 = "BP_LAMINAR_AIR_FLOW_CHAMBER_1";

	public static final String HYPEN = "-";

	public static final String SPACE = " ";

	public static final String EMPTY = "";

	public static final String NOT_FOUND = "Not Found ";

	public static final String ALPHA_NUMBER_REG_EXP = "^[a-zA-Z0-9]{4,4}$" ;
	//Sorting
	public static final String DEFAULT_PAGE_NUMBER = "0";
	public static final String DEFAULT_PAGE_SIZE = "10";
	public static final String DEFAULT_SORT_BY = "id";
	public static final String DEFAULT_SORT_DIRECTION = "asc";
	
	public static final String PAGE_NUMBER = "PageNo";
	public static final String PAGE_SIZE = "PageSize";
	public static final String SORT_BY = "id";
	public static final String SORT_DIRECTION = "asc";
	
	//Error Messages
	public static final String BP_LAMINAR_AIR_FLOW_CHAMER_1_LOG_NOT_EXIST_MSG = "BP Laminar Air Flow Flow Chamber 1 Log not exist";
	public static final String BP_LAMINAR_AIR_FLOW_CHAMER_1_LOG_NOT_EXIST_CODE = "BP_LAMINAR_AIR_FLOW_CHAMER_1_LOG_NOT_EXIST";

	//Audit
	public static final String CREATED_BY = "CREATED_BY";
	public static final String CREATED_DATE = "CREATED_DATE";
	public static final String LAST_MODIFIED_BY = "LAST_MODIFIED_BY";
	public static final String LAST_MODIFIED_DATE = "LAST_MODIFIED_DATE";

}
