package com.springmvc.crudexample.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springmvc.crudexample.dao.CustomerDAO;
import com.springmvc.crudexample.entity.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerDAO customerDAO2;
	
	@Override
	@Transactional
	public List<Customer> getCustomers() {
		
		return customerDAO2.getCustomers();
		
		
	}

	@Override
	@Transactional
	public void addCustomer(Customer customer) {
		
		customerDAO2.addCustomer(customer);
	}

	@Override
	@Transactional
	public Customer getCustomer(int customerID) {
		return customerDAO2.getCustomer(customerID);
	}

	@Override
	@Transactional
	public void deleteCustomer(int customerID) {
		customerDAO2.deleteCustomer(customerID);
		
	}

	@Override
	@Transactional
	public List<Customer> searchCustomers(String searchInput) {
		return customerDAO2.searchCustomers(searchInput);
	}

}
