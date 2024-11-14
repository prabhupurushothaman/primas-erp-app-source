package com.primas.branch.exception;

import lombok.Data;

@Data
public class PrimasBranchCustomException  extends RuntimeException{

	private String errorCode;
	
	public PrimasBranchCustomException(String message, String errorCode) { 
		super(message);
		this.errorCode = errorCode;
		
	}
}
