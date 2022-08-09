package com.springmvc.crudexample.dao;

import java.util.List;

import com.springmvc.crudexample.entity.Customer;

public interface CustomerDAOWithoutServiceLayer {
	public List<Customer> getCustomers();
}
