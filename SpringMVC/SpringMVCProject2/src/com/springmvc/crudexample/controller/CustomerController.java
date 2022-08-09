package com.springmvc.crudexample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.springmvc.crudexample.dao.CustomerDAOWithoutServiceLayer;
import com.springmvc.crudexample.entity.Customer;
import com.springmvc.crudexample.service.CustomerService;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	//need to inject the customer DAO
	@Autowired
	private CustomerDAOWithoutServiceLayer customerDAO;
	
	@Autowired
	private CustomerService customerService;
	
	
	/*
	 * By default when nothing is mentioned in form, then it's GET method. Below three forms of get method notations are valid
	 * 
	 * 
	 * @RequestMapping("/list")
	 * @RequestMapping(path="/list",method=RequestMethod.GET)
	 * @GetMapping("/list")
	 *
	 *
	 *
	 */
	
//	@RequestMapping("/list")
//	@RequestMapping(path="/list",method=RequestMethod.GET)
	@GetMapping("/listWithoutServiceLayer")
	public String listCustomers(Model model) {
		
		// get customers from the DAO
		List<Customer> customers = customerDAO.getCustomers();
		
		// add the customers to the model
		model.addAttribute("customers", customers);
		
		return "list-customersWithoutServiceLayer";
	}
	
	@GetMapping("/list")
	public String listCustomers2(Model model) {
		
		// get customers from the DAO
		List<Customer> customers = customerService.getCustomers();
		
		// add the customers to the model
		model.addAttribute("customers", customers);
		
		return "list-customers";
	}
	
	
	@GetMapping("/showFormForAdd")
	public String addCustomer(Model model) {
		Customer customer = new Customer();
		model.addAttribute("customer", customer);
		return "customer-form";
	}
	
	@GetMapping("/showFormForUpdate")
	public String updateCustomer(@RequestParam("customerID") int customerID,
									Model model) {
		Customer customer = customerService.getCustomer(customerID);
		model.addAttribute("customer", customer);
		return "customer-form";
	}
	
	
	@GetMapping("/delete")
	public String deleteCustomer(@RequestParam("customerID") int customerID) {
		customerService.deleteCustomer(customerID);
		return "redirect:/customer/list";
	}
	
	@PostMapping("/saveCustomer")
	public String SaveCustomer(@ModelAttribute("customer") Customer customerDetails) {
		
		customerService.addCustomer(customerDetails);
		
		return "redirect:/customer/list";
	}
	
	@GetMapping("/search")
	public String searchCustomer(@RequestParam("searchInput") String searchInput, Model model) {
		System.out.println("Hi");
		
		List<Customer> customers = customerService.searchCustomers(searchInput);
		// add the customers to the model
		model.addAttribute("customers", customers);
		return "list-customers";
	}
}
