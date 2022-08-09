package com.learnspring.aop2.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyDemoLoggingAspect {
	@Before("execution(* com.learnspring.aop2.dao.*.*(..))")
	public void beforeAspectLogging() {
		System.out.println("\n==> BEFORE ASPECT ==> Logging using Before aspect");
	}
	
}
