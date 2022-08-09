package com.learnspring.aopdemo03rethrow.around.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AOPExpressions {
	@Pointcut("execution (* com.learnspring.aopdemo03rethrow.around.service.*.*(..))")
	public void forServicePackage() {}
	
	@Pointcut("execution (* com.learnspring.aopdemo03rethrow.around.service.*.get*(..))")
	public void getter() {}
	
	@Pointcut("execution (* com.learnspring.aopdemo03rethrow.around.service.*.set*(..))")
	public void setter() {}
	
	@Pointcut("forServicePackage() && !(getter() || setter())")
	public void forServicePackageWithoutSetterAndGetter() {}
}
