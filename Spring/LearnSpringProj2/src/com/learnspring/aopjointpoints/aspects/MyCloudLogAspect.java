package com.learnspring.aopjointpoints.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import com.learnspring.aopjointpoints.Account;

@Aspect
@Component
public class MyCloudLogAspect {
	
	@Before("com.learnspring.aopjointpoints.aspects.AOPExpressions.forDAOPackageWithoutGetterAndSetter()")
	public void addAspectLoggingMessage(JoinPoint joinPoint) {
		System.out.println("\n===>MyCloudLogAspect===>Loggign Messages For DAO");
		
		// display method signature
		MethodSignature sig = (MethodSignature)joinPoint.getSignature();
		System.out.println("Method signature " + sig);
		
		// display method arguments
		Object[] args = joinPoint.getArgs();
		for (Object arg : args) {
			System.out.println("Argument : " + arg);
			if(arg instanceof Account) {
				Account acc = (Account)arg;
				System.out.println("Account Name is " + acc.getName());
				System.out.println("Account Service Code is " + acc.getNumber());
			}
		}
	}
}
