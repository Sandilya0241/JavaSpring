package com.learnspring3.mvcmodule3;

import java.util.LinkedHashMap;

public class Student {
	private String firstName;
	private String lastName;
	private String favoriteCourse;
	private String favoriteCourse2;
	private LinkedHashMap<String, String> favoriteCourse2Options;
	private String[] operatingSystems;
	//private String[] webTechnologies;
	//private LinkedHashMap<String, String> webTechnologiesOptions;
	
	
	
	public Student() {
		favoriteCourse2Options = new LinkedHashMap<>();
		favoriteCourse2Options.put("Java", "Java");
		favoriteCourse2Options.put("C#", "C#");
		favoriteCourse2Options.put("Go", "Go");
		favoriteCourse2Options.put("Python", "Python");
		
		/*webTechnologiesOptions.put("HTML", "HTML");
		webTechnologiesOptions.put("JavaScript", "JavaScript");
		webTechnologiesOptions.put("CSS", "CSS");
		*/
	}

	public LinkedHashMap<String, String> getFavoriteCourse2Options() {
		return favoriteCourse2Options;
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

	public String getFavoriteCourse() {
		return favoriteCourse;
	}

	public void setFavoriteCourse(String favoriteCourse) {
		this.favoriteCourse = favoriteCourse;
	}

	public String getFavoriteCourse2() {
		return favoriteCourse2;
	}

	public void setFavoriteCourse2(String favoriteCourse2) {
		this.favoriteCourse2 = favoriteCourse2;
	}

	/*public String[] getWebTechnologies() {
		return webTechnologies;
	}

	public void setWebTechnologies(String[] webTechnologies) {
		this.webTechnologies = webTechnologies;
	}*/

	public String[] getOperatingSystems() {
		return operatingSystems;
	}

	public void setOperatingSystems(String[] operatingSystems) {
		this.operatingSystems = operatingSystems;
	}

//	public LinkedHashMap<String, String> getWebTechnologiesOptions() {
//		return webTechnologiesOptions;
//	}
	
	
}
