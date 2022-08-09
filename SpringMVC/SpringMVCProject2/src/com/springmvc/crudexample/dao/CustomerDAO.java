package com.springmvc.crudexample.dao;

import java.util.List;

import com.springmvc.crudexample.entity.Customer;

public interface CustomerDAO {
	public List<Customer> getCustomers();
	public void addCustomer(Customer customer);
	public Customer getCustomer(int customerID);
	public void deleteCustomer(int customerID);
	public List<Customer> searchCustomers(String searchInput);
}
