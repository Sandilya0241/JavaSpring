package com.learnspring.springcrud.restdemo.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.RequestEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learnspring.springcrud.restdemo.customexception.CustomerNotFoundException;
import com.learnspring.springcrud.restdemo.entity.Customer;
import com.learnspring.springcrud.restdemo.service.CustomerService;

@RestController
@RequestMapping("/api")
public class CustomerRestController {

	//Autowire Service Layer
	@Autowired
	private CustomerService customerService;
	
	@GetMapping("/customers")
	public List<Customer> getCustomers() {
		List<Customer> customers = customerService.getCustomers();
		return customers;
	}
	
	
	@GetMapping("/customers/{CustomerID}")
	public Customer getCustomer(@PathVariable int CustomerID) {
		Customer customer = customerService.getCustomer(CustomerID);
		if(customer == null) {
			throw new CustomerNotFoundException("Customer not found - " + CustomerID);
		}
		return customer;
	}
	
	@PostMapping("/customers")
	public Customer addCustomer(@RequestBody Customer customer) {
		customer.setId(0);
		customerService.saveCustomer(customer);
		return customer;
	}
	
	@PutMapping("/customers")
	public Customer updateCustomer(@RequestBody Customer customer) {
		customerService.saveCustomer(customer);
		return customer;
	}
	
	@DeleteMapping("/customers/{CustomerID}")
	public String deleteCustomer(@PathVariable int CustomerID) {
		Customer tmpCustomer = customerService.getCustomer(CustomerID);
		
		if(tmpCustomer == null) {
			throw new CustomerNotFoundException("Customer not found with id - " + CustomerID);
		}
		customerService.DeleteCustomer(CustomerID);
		return "Sucessfully deleted customer with id - " + CustomerID;
	}
}
