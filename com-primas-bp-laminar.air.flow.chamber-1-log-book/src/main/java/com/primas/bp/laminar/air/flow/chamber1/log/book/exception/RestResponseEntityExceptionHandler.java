package com.primas.bp.laminar.air.flow.chamber1.log.book.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.primas.bp.laminar.air.flow.chamber1.log.book.model.ErrorResponse;

@ControllerAdvice
public class RestResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {

	@ExceptionHandler(PrimasBPLaminarAirFlowChamber1CustomException.class)
	public ResponseEntity<ErrorResponse> handlePrimasMrndShaker3LogServiceException (PrimasBPLaminarAirFlowChamber1CustomException exception) {
		return new ResponseEntity<>(new ErrorResponse().builder()
				.errorMessage(exception.getMessage())
				.errorCode(exception.getErrorCode())
				.build(),HttpStatus.NOT_FOUND);
	}
}