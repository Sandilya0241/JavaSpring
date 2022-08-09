package com.learnspring.jackson.json.demo;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;


public class Driver2 {
	public static void main(String[] args) {
		try {
			// Create object mapper
			ObjectMapper mapper = new ObjectMapper();
			
			// read JSON file and map/convert to Java POJO
			// data/simple-lite.json
			
			Student2 student = mapper.readValue(new File("data/sample-full.json"), Student2.class);
			
			// print values from JSON file
			System.out.println("First Name : " + student.getFirstName());
			System.out.println("Last Name : " + student.getLastName());
			
			// Print Address and Languages
			Address address = student.getAddress();
			
			System.out.println("Street details : " + address.getStreet());
			System.out.println("City details : " + address.getCity());
		
			System.out.println("Known languages : ---------");
			for (String language : student.getLanguages()) {
				System.out.println(language);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
