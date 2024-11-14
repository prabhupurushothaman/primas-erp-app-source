package com.primas.city.dto;

import com.primas.city.util.PrimasCityConstants;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;


@Data
public class PrimasCityMasterDto {

	private long id;

	@NotEmpty(message = PrimasCityConstants.COUNTRY_CODE_EMPTY_MSG)
	@Size(min = 4 , message = PrimasCityConstants.COUNTRY_CODE_MIN_LENGTH_ERROR_MSG)
	@Size(max = 4 , message = PrimasCityConstants.COUNTRY_CODE_MAX_LENGTH_ERROR_MSG)
	//@Pattern(regexp = PrimasCityConstants.ALPHA_NUMBER_REG_EXP, message = PrimasCityConstants.UNIT_CODE_ALLOWED_CHARS_ERROR_MSG)
	private String countryCode;

	@NotEmpty(message = PrimasCityConstants.STATE_CODE_EMPTY_MSG)
	@Size(min = 4 , message = PrimasCityConstants.STATE_CODE_MIN_LENGTH_ERROR_MSG)
	@Size(max = 4 , message = PrimasCityConstants.STATE_CODE_MAX_LENGTH_ERROR_MSG)
	//@Pattern(regexp = PrimasCityConstants.ALPHA_NUMBER_REG_EXP, message = PrimasCityConstants.UNIT_CODE_ALLOWED_CHARS_ERROR_MSG)
	private String stateCode;

	@NotEmpty(message = PrimasCityConstants.CITY_CODE_EMPTY_MSG)
	@Size(min = 4 , message = PrimasCityConstants.CITY_CODE_MIN_LENGTH_ERROR_MSG)
	@Size(max = 4 , message = PrimasCityConstants.CITY_CODE_MAX_LENGTH_ERROR_MSG)
	//@Pattern(regexp = PrimasCityConstants.ALPHA_NUMBER_REG_EXP, message = PrimasCityConstants.UNIT_CODE_ALLOWED_CHARS_ERROR_MSG)

	private String cityCode;

	@NotEmpty(message = PrimasCityConstants.CITY_DESCRIPTION_EMPTY_MSG)
	@Size(min = 4 , message = PrimasCityConstants.CITY_DESCRIPTION_MIN_LENGTH_ERROR_MSG)
	@Size(max = 25 , message = PrimasCityConstants.CITY_DESCRIPTION_MAX_LENGTH_ERROR_MSG)
	//@Pattern(regexp = PrimasCityConstants.ALPHA_NUMBER_REG_EXP, message = PrimasCityConstants.UNIT_DESCRIPTION_ALLOWED_CHARS_ERROR_MSG)

	private String cityDescription;
}
