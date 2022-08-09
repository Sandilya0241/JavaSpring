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
public class CustomerDAOImpl implements CustomerDAO{

	//need to inject the session factory
	@Autowired
	private SessionFactory sessionFactory;
	
	
	public List<Customer> getCustomers() {
		// Get current session
		Session session = sessionFactory.getCurrentSession();
		
		// Create query
		Query<Customer> query = session.createQuery("from Customer order by lastName", 
													Customer.class);
		
		// execute the query and collect results
		List<Customer> listOfCustomers = query.getResultList();
		
		//return data
		return listOfCustomers;
	}

	
	public void addCustomer(Customer customer) {
		// Get current session
		Session session = sessionFactory.getCurrentSession();
		
		session.saveOrUpdate(customer);
	}
	
	
	
	public void deleteCustomer(int customerId) {
		
		// Get current session
		Session session = sessionFactory.getCurrentSession();
		// Option 1
		/* 
		
		Customer customer = session.get(Customer.class, customerId);
		if(customer!=null) {
			session.delete(customer);
		}
		 
		*/
		
		// Option 2
		Query<Customer> query = session.createQuery("delete from Customer where id=:paramCustomerID");
		query.setParameter("paramCustomerID", customerId);
		query.executeUpdate();
	}


	@Override
	public Customer getCustomer(int customerID) {
		
		Session session = sessionFactory.getCurrentSession();
		Customer customer = session.get(Customer.class, customerID);
		return customer;
	}


	@Override
	public List<Customer> searchCustomers(String searchInput) {
		Session session = sessionFactory.getCurrentSession();
		Query  query = null;
		if(searchInput.trim().length() > 0 && searchInput != null) {
			query = session.createQuery("from Customer where lower(firstName) like :paramSearchInput or lower(lastName) like :paramSearchInput", Customer.class);
			query.setParameter("paramSearchInput", "%" + searchInput.toLowerCase() + "%");
		} else {
			query = session.createQuery("from Customer", Customer.class);
		}
		
		System.out.println("Debug");
		List<Customer> customers = query.getResultList();
		return customers;
	}
}
