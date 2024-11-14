package com.primas.bp.laminar.air.flow.chamber1.log.book.exception;

import lombok.Data;

@Data
public class PrimasBPLaminarAirFlowChamber1CustomException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String errorCode;
	
	public PrimasBPLaminarAirFlowChamber1CustomException(String message, String errorCode) { 
		super(message);
		this.errorCode = errorCode;
		
	}
}
