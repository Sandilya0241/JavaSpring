package com.learnspring.springcrud.restdemo.service;

import java.util.List;

import com.learnspring.springcrud.restdemo.entity.Customer;

public interface CustomerService {
	public List<Customer> getCustomers();
	public void saveCustomer (Customer customer);
	public Customer getCustomer(int id);
	public void DeleteCustomer(int id);
}
