
package com.learnspring.aopdemo01.afterthrowing.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(2)
public class APILoggingDemoAspect {
	
	@After("com.learnspring.aopdemo01.afterthrowing.aspect.AOPExpressions.forDAOPackageWithoutGetterAndSetter()") 
	public void AfterAdvice(JoinPoint joinPoint){
		System.out.println("==> Execute -- After APILoggingDemoAspect Aspect called @ " + joinPoint.getSignature().toShortString());
	}
	
	
	@AfterThrowing(
					pointcut="com.learnspring.aopdemo01.afterthrowing.aspect.AOPExpressions.forDAOPackageWithoutGetterAndSetter()",
					throwing="theExec"
				)
	public void AfterThrowingLoggingAspect(JoinPoint joinPoint, Throwable theExec) {
		System.out.println("==> Execute -- AfterThrowing APILoggingDemoAspect Aspect called @ " + joinPoint.getSignature().toShortString());
		
		System.out.println("==> Execute -- AfterThrowing APILoggingDemoAspect Exception is " + theExec);
	}
}
