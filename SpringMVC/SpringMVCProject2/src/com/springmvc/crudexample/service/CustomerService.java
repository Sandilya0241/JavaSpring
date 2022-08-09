package com.springmvc.crudexample.service;

import java.util.List;

import com.springmvc.crudexample.entity.Customer;


public interface CustomerService {
	public List<Customer> getCustomers();
	
	public void addCustomer(Customer customer);

	public Customer getCustomer(int customerID);

	public void deleteCustomer(int customerID);

	public List<Customer> searchCustomers(String searchInput);
}
