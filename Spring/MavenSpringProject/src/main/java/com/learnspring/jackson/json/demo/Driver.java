package com.learnspring.jackson.json.demo;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Driver {
	public static void main(String[] args) {
		try {
			// Create object mapper
			ObjectMapper mapper = new ObjectMapper();
			
			// read JSON file and map/convert to Java POJO
			// data/simple-lite.json
			
			Student student = mapper.readValue(new File("data/sample-lite.json"), Student.class);
			
			// print values from JSON file
			System.out.println("First Name : " + student.getFirstName());
			System.out.println("Last Name : " + student.getLastName());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
