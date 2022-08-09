package com.learnspring3.mvcmodule;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/spring")
public class SpringController2 {
	
	
	@RequestMapping("/showForm")
	public String showMyForm() {
		return "springworld-form";
	}
	
	
	@RequestMapping("/processForm")
	public String showMyNaughtyForm() {
		return "springworld";
	}
}
