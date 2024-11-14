package com.primas.city.exception;

import lombok.Data;

@Data
public class PrimasCityCustomException  extends RuntimeException{

	private String errorCode;
	
	public PrimasCityCustomException(String message, String errorCode) { 
		super(message);
		this.errorCode = errorCode;
		
	}
}
