package com.learnspring3.mvcmodule2.taglibanddatabinding;

import java.util.LinkedHashMap;

public class Student {
	private String firstName;
	private String lastName;
	private String country;
	private String gender;
	private String countryOfResidence;
	
	private LinkedHashMap<String, String> genderOptions;
	
	
	public Student() {
		genderOptions = new LinkedHashMap<>();
		genderOptions.put("M", "Male");
		genderOptions.put("F", "Female");
		genderOptions.put("O", "Others");
		genderOptions.put("N", "Cannot Say");
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public LinkedHashMap<String, String> getGenderOptions() {
		return genderOptions;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getCountryOfResidence() {
		return countryOfResidence;
	}

	public void setCountryOfResidence(String countryOfResidence) {
		this.countryOfResidence = countryOfResidence;
	}
	
	
}
