package com.learnspring3.mvcmodule3;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
@RequestMapping("/student1")
public class StudentController {
	
	
	@RequestMapping("/showForm")
	public String showForm(Model model) {
		
		// create a new Student object
		Student theStudent = new Student();
		
		// add student object to the model
		model.addAttribute("studentAttribName", theStudent);
		
		return "student-form1";
	}
	
	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("studentAttribName") Student student) {
		
		// log the input data
		
		System.out.println("Input student data : " + student.getFirstName() + " " + student.getLastName());
		
		return "student-confirmation1";
	}
	
	
}
