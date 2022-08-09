package com.learnspring.aopdemo.after.aspect;

import java.util.List;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.learnspring.aopdemo.after.Account;

@Order(7)
@Aspect
@Component
public class MyLoggingDemoAspect {
	@Before("com.learnspring.aopdemo.after.aspect.AOPExpressions.aspectForAOPOrderingWithNoGetterSetter()")
	public void beforeAspect() {
		System.out.println("\n==>> EXEECUTION ASPECT ... inside MyLoggingDemoAspect.beforeAspect");
	}
	
	
	@AfterReturning(
					pointcut="(com.learnspring.aopdemo.after.aspect.AOPExpressions.aspectForAOPOrderingWithNoGetterSetter())",
					returning="result")
	public void afterReturningAspect(JoinPoint joinPoint, List<Account> result) {
		System.out.println("==>> EXEECUTION ASPECT ... inside MyLoggingDemoAspect.afterReturningAspect");
		
		System.out.println("\n");
		System.out.println("\n Aspect results ... " + result);
		System.out.println("\nInside method " + joinPoint.getSignature().toShortString());
		CapitalizeAccountDetails(result);
		System.out.println("\n After conversion ... " + result);
	}
	
	private void CapitalizeAccountDetails(List<Account> listOfAccounts) {
		for (Account account : listOfAccounts) {
			account.setName(account.getName().toUpperCase());
		}
	}
}
