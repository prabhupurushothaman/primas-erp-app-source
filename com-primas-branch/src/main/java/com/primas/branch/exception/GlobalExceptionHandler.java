package com.primas.branch.exception;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.primas.branch.util.PrimasBranchConstants;

@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler{
	
	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<ErrorDetails> handleResourceNotFoundException(ResourceNotFoundException exception, WebRequest webRequest) {
		ErrorDetails errorDetails = new ErrorDetails(
				LocalDateTime.now(),
				exception.getMessage(),
				webRequest.getDescription(false),
				PrimasBranchConstants.BRANCH_NOT_FOUND
				);
		return new ResponseEntity<>(errorDetails,HttpStatus.NOT_FOUND);
	}


	@ExceptionHandler(PrimasBranchAlreadyExistException.class)
	public ResponseEntity<ErrorDetails> handlePrimasBranchAlreadyExistException(PrimasBranchAlreadyExistException exception, WebRequest webRequest) {
		ErrorDetails errorDetails = new ErrorDetails(
				LocalDateTime.now(),
				exception.getMessage(),
				webRequest.getDescription(false),
				PrimasBranchConstants.PRIMAS_BRANCH_ALREADY_EXISTS
		);
		return new ResponseEntity<>(errorDetails,HttpStatus.BAD_REQUEST);
	}
	
	
	@Override
	protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
			HttpHeaders headers, HttpStatusCode status, WebRequest request) {
		// TODO Auto-generated method stub

		Map<String, String> errors = new HashMap<>();
		List<ObjectError> errorList = ex.getBindingResult().getAllErrors();
		
		errorList.forEach((error) -> {
			String fieldName = ((FieldError) error).getField();
			String message = error.getDefaultMessage();
			errors.put(fieldName, message);
		}); 
		
		return new ResponseEntity<>(errors,HttpStatus.BAD_REQUEST);
	}
}
