package com.learnspring.springcrud.restdemo.aspect;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.learnspring.springcrud.restdemo.customexception.CustomerNotFoundException;
import com.learnspring.springcrud.restdemo.entity.CustomerErrorResponse;

@ControllerAdvice
public class CustomerControllerAspect {
	
	//Add exception handler for CustomerNotFoundException
	@ExceptionHandler
	public ResponseEntity<CustomerErrorResponse> errorHandler(CustomerNotFoundException exc) {
		
		CustomerErrorResponse resp = new CustomerErrorResponse(HttpStatus.NOT_FOUND.value(),
																												exc.getMessage(),
																												System.currentTimeMillis());
		
		
		return new ResponseEntity<>(resp, HttpStatus.NOT_FOUND);
	}
	
	//Add exception handler for .. to catch any exception...
	@ExceptionHandler
	public ResponseEntity<CustomerErrorResponse> genericExceptionHandler(Exception exc) {
		CustomerErrorResponse resp = new CustomerErrorResponse(HttpStatus.BAD_REQUEST.value(),
																												exc.getMessage(),
																												System.currentTimeMillis());
		return new ResponseEntity<>(resp, HttpStatus.BAD_REQUEST);
	}
}

