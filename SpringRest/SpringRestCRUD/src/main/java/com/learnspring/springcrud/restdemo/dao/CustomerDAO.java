package com.learnspring.springcrud.restdemo.dao;

import java.util.List;

import com.learnspring.springcrud.restdemo.entity.Customer;

public interface CustomerDAO {
	public List<Customer> getCustomers();
	public void saveCustomer (Customer customer);
	public Customer getCustomer(int id);
	public void DeleteCustomer(int id);
}
