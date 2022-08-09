package com.learnspring.aopdemo01.afterthrowing.aspect;

import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
public class AOPExpressions {
	@Pointcut("execution (* com.learnspring.aopdemo01.afterthrowing.dao.*.*(..))")
	public void forDAOPackage() {}
	
	@Pointcut("execution (* com.learnspring.aopdemo01.afterthrowing.dao.*.get*(..))")
	public void getter() {}
	
	@Pointcut("execution (* com.learnspring.aopdemo01.afterthrowing.dao.*.set*(..))")
	public void setter() {}
	
	@Pointcut("forDAOPackage() && !(getter() || setter())")
	public void forDAOPackageWithoutGetterAndSetter() {}
}
