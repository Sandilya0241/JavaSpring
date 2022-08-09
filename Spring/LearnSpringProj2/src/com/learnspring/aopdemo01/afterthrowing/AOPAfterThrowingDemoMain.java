package com.learnspring.aopdemo01.afterthrowing;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.learnspring.aopdemo01.afterthrowing.dao.AOPAfterThrowingDemoDAO;

public class AOPAfterThrowingDemoMain {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AOPAfterThrowingDemoConfig.class);
		
		AOPAfterThrowingDemoDAO aopAfterThrowingDemoDAO = context.getBean("AOPAfterThrowingDemoDAO", AOPAfterThrowingDemoDAO.class);
		
		try {
			boolean TripWire = false;
			List<Account> listOfAccounts = null;
			listOfAccounts = aopAfterThrowingDemoDAO.findAccounts(TripWire);
			System.out.println("In Main method .. " + listOfAccounts);
		} catch (Exception e) {
			System.out.println("Exception caught in Main ... " + e);
		}
		context.close();
	}
}
