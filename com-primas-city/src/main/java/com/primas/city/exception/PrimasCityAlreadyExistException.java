package com.primas.city.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class PrimasCityAlreadyExistException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	private String message;

	public PrimasCityAlreadyExistException(String message) { 
		super(message);
	}
}
