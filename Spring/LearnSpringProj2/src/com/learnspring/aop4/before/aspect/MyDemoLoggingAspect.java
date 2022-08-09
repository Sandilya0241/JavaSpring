package com.learnspring.aop4.before.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyDemoLoggingAspect {

	@Pointcut("execution(* com.learnspring.aop4.before.dao.*.*(..))")
	private void forDAOPackage() {}
	
	@Pointcut("execution(* com.learnspring.aop4.before.dao.*.get*(..))")
	private void getter() {}
	
	@Pointcut("execution(* com.learnspring.aop4.before.dao.*.set*(..))")
	private void setter() {}
	
	@Pointcut("forDAOPackage() && !(getter() || setter())")
	private void forDAOPackageWithNoGetterSetter() {}
	
	@Before("forDAOPackageWithNoGetterSetter()")
	public void beforeAspect() {
		System.out.println("\n===>> Execute Before Acspect");
	}
	
}
