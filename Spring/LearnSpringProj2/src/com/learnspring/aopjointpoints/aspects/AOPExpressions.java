package com.learnspring.aopjointpoints.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AOPExpressions {

	@Pointcut("execution (* com.learnspring.aopjointpoints.dao.*.*(..))")
	public void forDAOPackage() {}
	
	@Pointcut("execution (* com.learnspring.aopjointpoints.dao.*.get*(..))")
	public void getter() {}
	
	@Pointcut("execution (* com.learnspring.aopjointpoints.dao.*.set*(..))")
	public void setter() {}
	
	@Pointcut("forDAOPackage() && !(getter() || setter())")
	public void forDAOPackageWithoutGetterAndSetter() {}
}
