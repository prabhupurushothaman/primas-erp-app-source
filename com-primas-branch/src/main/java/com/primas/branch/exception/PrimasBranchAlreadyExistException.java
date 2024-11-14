package com.primas.branch.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class PrimasBranchAlreadyExistException extends RuntimeException{

	private String message;


	public PrimasBranchAlreadyExistException(String message) { 
		super(message);
	}
}
