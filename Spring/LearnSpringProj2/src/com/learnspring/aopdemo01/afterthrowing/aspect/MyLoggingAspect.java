package com.learnspring.aopdemo01.afterthrowing.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
public class MyLoggingAspect {
	@Before("com.learnspring.aopdemo01.afterthrowing.aspect.AOPExpressions.forDAOPackageWithoutGetterAndSetter()")
	public void MyLoggingAspectForAddAccount() {
		System.out.println("==> Execute -- MyLoggingAspectAspect called @ " + getClass());
	}
}
