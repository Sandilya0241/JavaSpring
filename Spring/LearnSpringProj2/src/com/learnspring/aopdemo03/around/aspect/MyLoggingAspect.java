package com.learnspring.aopdemo03.around.aspect;

import java.util.logging.Logger;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyLoggingAspect {
	private Logger myLogger = Logger.getLogger(getClass().getName()); 
	@Around("com.learnspring.aopdemo03.around.aspect.AOPExpressions.forServicePackageWithoutSetterAndGetter()")
	public Object addLoggingAspect(ProceedingJoinPoint joinPoint) throws Throwable{
		myLogger.info("Inside MyLoggingAspect Aspect " + joinPoint.getSignature().toShortString());
		long startTime = System.currentTimeMillis();
		
		
		Object result = null;
		try {
			result = joinPoint.proceed();
		} catch (Exception e) {
			myLogger.warning(e.getMessage());
			result = "Major accident!!! But don't worry";
		}
		
		
		long endTime = System.currentTimeMillis();
		
		myLogger.info("Execution time " + (endTime - startTime)/1000.0 + " seconds");
		
		return result;
	}
}

