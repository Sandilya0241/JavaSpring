
package com.learnspring3.mvcmodule;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}
	
	@RequestMapping("/showFormVersion1")
	public String methodNameOfYourWish1() {
		return "helloworld-form1";
	}
	
	@RequestMapping("/processFormVersion1")
	public String methodNameOfYourWish1(HttpServletRequest request, Model model) {
		
		String studentName = request.getParameter("TXT_USRNAME");
		
		studentName = studentName.toUpperCase();
		
		String msg = "Yo! " + studentName;
		
		model.addAttribute("NameOfYourWish1", msg);
		
		return "helloworldversion1";
	}
	
	
	
	
	
	@RequestMapping("/showFormVersion2")
	public String methodNameOfYourWish2() {
		return "helloworld-form2";
	}
	
	@RequestMapping("/processFormVersion2")
	public String methodNameOfYourWish2(@RequestParam("TXT_USRNAME") String studentName, Model model) {
		
		studentName = studentName.toUpperCase();
		
		String msg = "Yo! " + studentName;
		
		model.addAttribute("NameOfYourWish", msg);
		
		return "helloworldversion2";
	}
	
}
