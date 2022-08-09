package com.springmvc.crudexample.dao;

import java.util.List;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.springmvc.crudexample.entity.Customer;

@Repository
public class CustomerDAOImpl2 implements CustomerDAOWithoutServiceLayer{

	//need to inject the session factory
	@Autowired
	private SessionFactory sessionFactory;
	
	@Transactional
	public List<Customer> getCustomers() {
		// Get current session
		Session session = sessionFactory.getCurrentSession();
		
		// Create query
		Query<Customer> query = session.createQuery("from Customer");
		
		// execute the query and collect results
		List<Customer> listOfCustomers = query.getResultList();
		
		//return data
		return listOfCustomers;
	}

}
