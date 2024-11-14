package com.primas.bp.laminar.air.flow.chamber1.log.book.exception;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ErrorDetails {
	private LocalDateTime timestamp;
	private String message;
	private String details;
	private String errorCode;

}