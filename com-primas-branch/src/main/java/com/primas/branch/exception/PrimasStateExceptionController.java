package com.primas.branch.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.primas.branch.util.PrimasBranchConstants;

@ControllerAdvice
public class PrimasStateExceptionController {
	 @ExceptionHandler(value = PrimasBranchNotFoundException.class)
	   public ResponseEntity<Object> exception(PrimasBranchNotFoundException exception) {
	      return new ResponseEntity<>(PrimasBranchConstants.BRANCH_NOT_FOUND, HttpStatus.NOT_FOUND);
	   }
}
