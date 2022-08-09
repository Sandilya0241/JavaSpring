package com.learnspring.restcontroller.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learnspring.restcontroller.demo.entity.Student;
import com.learnspring.restcontroller.demo.entity.StudentErrorResponse;
import com.learnspring.restcontroller.demo.exceptions.StudentNotFoundException;


@RestController
@RequestMapping("/api")
public class StudentRestController {

	private List<Student> students;
	
	// Load student list with some data
	// Using @PostConstruct ==> will get called only once 
	public void loadData() {
		students = new ArrayList<Student>();
		
		students.add(new Student("Poornima", "Patel"));
		students.add(new Student("Anupam", "Kher"));
		students.add(new Student("Leonardo", "de caprio"));
	} 
	
	@GetMapping("/students")
	public List<Student> getStudents() {
		loadData();
		return students;
	}
	
	@GetMapping("/students/{studentID}")
	public Student getStudentByID(@PathVariable int studentID) {
		loadData();
		
		if(studentID < 0 || studentID >= students.size()) {
			throw new StudentNotFoundException("Student ID not found - " + studentID);
		}
		return students.get(studentID);
	}
	/*
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
	}*/
}
