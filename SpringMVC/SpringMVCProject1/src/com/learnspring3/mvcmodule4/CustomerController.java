package com.learnspring3.mvcmodule4;

import java.util.LinkedHashMap;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	
	@InitBinder
	public void myInitBindier(WebDataBinder dataBinder) {
		StringTrimmerEditor stringTrimmer = new StringTrimmerEditor(true);
		dataBinder.registerCustomEditor(String.class, stringTrimmer);
	}
	
	
	@RequestMapping("/showForm")
	public String showForm(Model model) {
		
		// create a new Student object
		Customer theStudent = new Customer();
		
		// add student object to the model
		model.addAttribute("customerAttribName", theStudent);
		
		return "customer-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm(@Valid @ModelAttribute("customerAttribName") Customer student, BindingResult res) {
		
		System.out.println("Binding Result: " + res);
		
		System.out.println("\n\n\n");
		
		if(!res.hasErrors())
			return "customer-confirmation";
		else
			return "customer-form";
	}
	
	
}
