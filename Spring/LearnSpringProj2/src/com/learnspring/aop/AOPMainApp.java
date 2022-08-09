package com.learnspring.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.learnspring.aop.dao.AccountDAO;
import com.learnspring.aop.dao.MembershipDAO;

public class AOPMainApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AOPJavaConfig.class);
		
		AccountDAO accountDAO = context.getBean("accountDAO", AccountDAO.class);
		Account account = new Account();
		accountDAO.addAccount(account, true);
		
		accountDAO.addAccount(account, false);
		
		MembershipDAO membershipDAO = context.getBean("membershipDAO", MembershipDAO.class);
		
		membershipDAO.addAccount();
		
		membershipDAO.addSillyMethod();
		
		context.close();
	}

}
