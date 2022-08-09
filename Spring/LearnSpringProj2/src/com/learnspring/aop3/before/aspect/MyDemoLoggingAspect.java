package com.learnspring.aop3.before.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyDemoLoggingAspect {

	@Pointcut("execution(* com.learnspring.aop3.before.dao.*.*(..))")
	public void beforeAspectLoggingPointCut() {}
	
	@Before("beforeAspectLoggingPointCut()")
	public void beforeAspectLogging() {
		System.out.println("\n==> BEFORE ASPECT ==> Logging using Before aspect");
	}
	
}
