package com.primas.city.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.primas.city.util.PrimasCityConstants;

@ControllerAdvice
public class PrimasCityExceptionController {
	@ExceptionHandler(value = PrimasCityNotFoundException.class)
	public ResponseEntity<Object> exception(PrimasCityNotFoundException exception) {
		return new ResponseEntity<>(PrimasCityConstants.CITY_NOT_FOUND, HttpStatus.NOT_FOUND);
	}
}
