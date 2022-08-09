package com.learnspring.aop3.before;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.learnspring.aop3.before.dao.MembershipDAO;
import com.learnspring.aop3.before.dao.AccountDAO;

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
