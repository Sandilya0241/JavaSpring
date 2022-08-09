package com.learnspring.aopdemo.after;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.learnspring.aopdemo.after.dao.AOPAfterDemoDAO;


public class AOPAfterMain {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AOPAfterDemoConfig.class);
		
		AOPAfterDemoDAO aopAfterDemoDAO = context.getBean("AOPAfterDemoDAO", AOPAfterDemoDAO.class);
		
		List<Account> listOfAccounts = aopAfterDemoDAO.findAccounts();
		
		System.out.println("Accounts " + listOfAccounts);
		
		context.close();
	}

}
