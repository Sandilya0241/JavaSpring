package com.learnspring.restcontroller.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/test")
public class SpringRestController {

	@GetMapping("/hello")
	public String sayHello() {
		return "Hello World";
	}
}
