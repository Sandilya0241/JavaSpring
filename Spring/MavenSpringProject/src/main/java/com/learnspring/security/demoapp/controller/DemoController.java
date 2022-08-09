package com.learnspring.security.demoapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {

	/*@GetMapping("/employees")
	public String getHome() {
		return "home";	
	}
	
	@GetMapping("/")
	public String getLandingPage() {
		return "landing";	
	}*/
	
	@GetMapping("/")
	public String getHome() {
		return "home";	
	}
	
	@GetMapping("/leaders")
	public String getLeaderHome() {
		return "leaders";	
	}
	
	@GetMapping("/systems")
	public String getAdminHome() {
		return "admins";	
	}
}
