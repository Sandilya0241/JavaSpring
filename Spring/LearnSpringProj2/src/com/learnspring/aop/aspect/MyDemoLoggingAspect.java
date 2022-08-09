package com.learnspring.aop.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyDemoLoggingAspect {
	// This is where we add all our related advices for logging available
	// We start with @Before Aspect
	/*
	@Before("execution(public void com.learnspring.aop.dao.AccountDAO.addAccount())")
	//@Before("execution(public void addAccount())")
	public void beforeAspectLogging() {
		System.out.println("==> BEFORE ASPECT ==> Logging using Before aspect");
	}
	
	
	@After("execution(public void add*())")
	//@Before("execution(public void addAccount())")
	public void afterAspectLogging() {
		System.out.println("==> AFTER ASPECT ==> Logging using After aspect");
	}*/
	
	
	@Before("execution(* add*(com.learnspring.aop.Account, ..))")
//	@Before("execution(* add*(Account))")                      // Will break without fully qualified name
	//@Before("execution(public void addAccount())")
	public void beforeAspectLogging() {
		System.out.println("==> BEFORE ASPECT ==> Logging using Before aspect");
	}
	
}
