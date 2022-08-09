package com.learnspring.aopjointpoints;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.learnspring.aopjointpoints.dao.AOPJointPointsDemoDAO;

public class AOPJointPointsDemoMain {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AOPJointPointsDemoConfig.class);
		
		AOPJointPointsDemoDAO daoObject = context.getBean("AOPJointPointsDemoDAO", AOPJointPointsDemoDAO.class);
		
		daoObject.addAccount(new Account("Name1", 1), false);
		
		daoObject.addAccount(new Account("Name3", 3), true);
		
		daoObject.setName("San");
		daoObject.setServiceCode("HDFC");
		
		String name = daoObject.getName();
		String serviceCode = daoObject.getServiceCode();
		
		context.close();
	}
}
