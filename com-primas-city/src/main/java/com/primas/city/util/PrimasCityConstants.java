package com.primas.city.util;

public interface PrimasCityConstants {
	
	//City
	public static final String TXN_ID = "TXN_ID";

	public static final String CITY_CODE_BLANK_MSG = "City Code is mandatory";
	public static final String CITY_CODE_EMPTY_MSG = "City Code should not be empty";
	public static final String CITY_DESCRIPTION_EMPTY_MSG = "City Description should not be empty";

	public static final String PRIMAS_CITY_MASTER = "PRIMAS_CITY_MASTER";
	public static final String CITY_DESCRIPTION = "CITY_DESCRIPTION";

	public static final String COUNTRY_CODE = "COUNTRY_CODE";
	public static final String STATE_CODE = "STATE_CODE";
	public static final String CITY_CODE = "CITY_CODE";
	public static final String STATE_DESCRIPTION = "STATE_DESCRIPTION";

	public static final String STATE_NOT_FOUND = "STATE_NOT_FOUND";

	public static final String PRIMAS_CITY_ALREADY_EXISTS = "PRIMAS_CITY_ALREADY_EXISTS";
	
	public static final String COUNTRY_CODE_EMPTY_MSG = "Country Code should not be empty";
	public static final String STATE_CODE_EMPTY_MSG = "State Code should not be empty";

	public static final String COUNTRY_CODE_MIN_LENGTH_ERROR_MSG = "Country Code Minimum length should be 4 characters";
	public static final String COUNTRY_CODE_MAX_LENGTH_ERROR_MSG = "Country Code Maximum should not exceed 4 characters";
	public static final String COUNTRY_CODE_ALLOWED_CHARS_ERROR_MSG = "Country Code must be of 4 to 4 length with no Special Characters";

	public static final String STATE_CODE_MIN_LENGTH_ERROR_MSG = "State Code Minimum length should be 4 characters";
	public static final String STATE_CODE_MAX_LENGTH_ERROR_MSG = "State Code Maximum should not exceed 25 characters";
	public static final String STATE_CODE_ALLOWED_CHARS_ERROR_MSG = "State Code must be of 4 to 25 length with no Special Characters";

	public static final String CITY_CODE_MIN_LENGTH_ERROR_MSG = "City Code Minimum length should be 4 characters";
	public static final String CITY_CODE_MAX_LENGTH_ERROR_MSG = "City Code Maximum should not exceed 4 characters";
	public static final String CITY_CODE_ALLOWED_CHARS_ERROR_MSG = "City Code must be of 4 to 4 length with no Special Characters";

	public static final String CITY_DESCRIPTION_MIN_LENGTH_ERROR_MSG = "City Description Minimum length should be 4 characters";
	public static final String CITY_DESCRIPTION_MAX_LENGTH_ERROR_MSG = "City Description Maximum should not exceed 25 characters";
	public static final String CITY_DESCRIPTION_ALLOWED_CHARS_ERROR_MSG = "City Description must be of 4 to 25 length with no Special Characters";

	public static final String REQUEST_MAPPING = "/api/cities";

	public static final String GET_MAPPING_WELCOME_CITY = "welcome-city";

	public static final String WELCOME_TEXT = "Welcome to Primas City Details";

	public static final String CITY_ALREADY_EXIST_MSG = "Primas City already exist";
	public static final String CITY_ALREADY_EXIST_CODE = "CITY_ALREADY_EXIST";


	public static final String MAPPING_ID = "/{id}";

	public static final String GET_MAPPING_ID = "/{id}";

	public static final String SMALL_ID = "id";

	public static final String CITY_NOT_FOUND = "CITY_NOT_FOUND";

	public static final String DELETE_CITY_SUCCESS_MSG = "City details deleted successfully.";
	public static final String CITY = "CITY";
	public static final String HYPEN = "-";

	public static final String SPACE = " ";

	public static final String NOT_FOUND = "Not Found ";

	public static final String ALPHA_NUMBER_REG_EXP = "^[a-zA-Z0-9]{4,4}$" ;
}