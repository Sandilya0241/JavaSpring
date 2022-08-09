package com.learnspring.aop2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.learnspring.aop2.dao.MembershipDAO;
import com.learnspring.aop2.dao.AccountDAO;

public class AOPMainApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AOPJavaConfig.class);
		
		AccountDAO accountDAO = context.getBean("accountDAO", AccountDAO.class);
		Account account = new Account();
		accountDAO.addAccount(account, true);
		accountDAO.method2();
		
		MembershipDAO membershipDAO = context.getBean("membershipDAO", MembershipDAO.class);
		membershipDAO.addAccount();
		membershipDAO.addSillyMethod();
		
		context.close();
	}

}
