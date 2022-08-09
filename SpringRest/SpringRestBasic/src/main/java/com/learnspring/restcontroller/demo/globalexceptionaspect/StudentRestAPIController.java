package com.learnspring.restcontroller.demo.globalexceptionaspect;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.learnspring.restcontroller.demo.entity.StudentErrorResponse;
import com.learnspring.restcontroller.demo.exceptions.StudentNotFoundException;


@ControllerAdvice
public class StudentRestAPIController {
	
	@ExceptionHandler
	public ResponseEntity<StudentErrorResponse> handleException(StudentNotFoundException exception) {
		// Create a StudentErrorResponse 
		StudentErrorResponse errorResponse = new StudentErrorResponse();
		errorResponse.setStatusCode(HttpStatus.NOT_FOUND.value());
		errorResponse.setMessage(exception.getMessage());
		errorResponse.setTimeStamp(System.currentTimeMillis());
		
		
		// Return Entity
		
		return new ResponseEntity<>(errorResponse, HttpStatus.NOT_FOUND);
	}

	// Add another exception handler
	@ExceptionHandler
	public ResponseEntity<StudentErrorResponse> handleGenericException(Exception exception) {
		
		
		StudentErrorResponse errorResponse = new StudentErrorResponse();
		errorResponse.setStatusCode(HttpStatus.BAD_REQUEST.value());
		errorResponse.setMessage(exception.getMessage());
		errorResponse.setTimeStamp(System.currentTimeMillis());
		
		
		
		
		return new ResponseEntity<>(errorResponse, HttpStatus.BAD_REQUEST);
	}
}
