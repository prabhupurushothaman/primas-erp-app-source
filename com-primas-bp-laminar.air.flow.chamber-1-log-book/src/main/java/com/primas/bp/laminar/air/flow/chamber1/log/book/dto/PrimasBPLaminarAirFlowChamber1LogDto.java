package com.primas.bp.laminar.air.flow.chamber1.log.book.dto;



import com.primas.bp.laminar.air.flow.chamber1.log.book.util.PrimasBpLaminarAirFlowChamber1LogBookConstants;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class PrimasBPLaminarAirFlowChamber1LogDto {

	private long id;

	//TODO: Pattern validation to be added
	@NotEmpty(message = PrimasBpLaminarAirFlowChamber1LogBookConstants.DATE_EMPTY_MSG)
	@NotBlank(message = "Name is mandatory")
	@Size(min = 5 , message = PrimasBpLaminarAirFlowChamber1LogBookConstants.DATE_MIN_LENGTH_ERROR_MSG)
	@Size(max = 20 , message = PrimasBpLaminarAirFlowChamber1LogBookConstants.DATE_MAX_LENGTH_ERROR_MSG)
	//@Pattern(regexp = PrimasBpLaminarAirFlowChamber1LogBookConstants.ALPHA_NUMBER_REG_EXP, message = PrimasBpLaminarAirFlowChamber1LogBookConstants.ALPHA_NUMBER_REG_EXP)
	@Pattern(regexp = "^[a-zA-Z0-9\\s]+$", message = "Not valid")
	private String date;

	@NotEmpty(message = PrimasBpLaminarAirFlowChamber1LogBookConstants.TIME_EMPTY_MSG)
	@Size(min = 5 , message = PrimasBpLaminarAirFlowChamber1LogBookConstants.TIME_MIN_LENGTH_ERROR_MSG)
	@Size(max = 25 , message = PrimasBpLaminarAirFlowChamber1LogBookConstants.TIME_MAX_LENGTH_ERROR_MSG)
	private String time;

	@NotEmpty(message = PrimasBpLaminarAirFlowChamber1LogBookConstants.FLASK_EMPTY_MSG)
	@Size(min = 5 , message = PrimasBpLaminarAirFlowChamber1LogBookConstants.FLASK_MIN_LENGTH_ERROR_MSG)
	@Size(max = 25 , message = PrimasBpLaminarAirFlowChamber1LogBookConstants.FLASK_MAX_LENGTH_ERROR_MSG)
	private String flask;
	
	@NotEmpty(message = PrimasBpLaminarAirFlowChamber1LogBookConstants.UV_DURATION_EMPTY_MSG)
	@Size(min = 5 , message = PrimasBpLaminarAirFlowChamber1LogBookConstants.UV_DURATION_MIN_LENGTH_ERROR_MSG)
	@Size(max = 25 , message = PrimasBpLaminarAirFlowChamber1LogBookConstants.UV_DURATION_MAX_LENGTH_ERROR_MSG)
	private String uvDuration;

	@NotEmpty(message = PrimasBpLaminarAirFlowChamber1LogBookConstants.ACTION_EMPTY_MSG)
	@Size(min = 5 , message = PrimasBpLaminarAirFlowChamber1LogBookConstants.ACTION_MIN_LENGTH_ERROR_MSG)
	@Size(max = 25 , message = PrimasBpLaminarAirFlowChamber1LogBookConstants.ACTION_MAX_LENGTH_ERROR_MSG)
	private String action;

	@NotEmpty(message = PrimasBpLaminarAirFlowChamber1LogBookConstants.EMP_CODE_EMPTY_MSG)
	@Size(min = 5 , message = PrimasBpLaminarAirFlowChamber1LogBookConstants.EMP_CODE_MIN_LENGTH_ERROR_MSG)
	@Size(max = 25 , message = PrimasBpLaminarAirFlowChamber1LogBookConstants.EMP_CODE_MAX_LENGTH_ERROR_MSG)
	private String empCode;
	
	private String errorMessage;

}
