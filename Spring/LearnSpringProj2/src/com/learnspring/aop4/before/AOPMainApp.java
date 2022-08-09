package com.learnspring.aop4.before;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.learnspring.aop4.before.dao.AccountDAO;

public class AOPMainApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AOPJavaConfig.class);
		
		AccountDAO accountDAO = context.getBean("accountDAO", AccountDAO.class);
		Account account = new Account();
		accountDAO.addAccount(account, true);
		accountDAO.method2();
		
		
		accountDAO.setServiceCode("ABC");
		accountDAO.setName("Name");
		
		String serviceCode = accountDAO.getServiceCode();
		String name = accountDAO.getName();
		
		context.close();
	}

}
