package com.learnspring.aopdemo03rethrow.around.aspect;

import java.util.logging.Logger;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyLoggingAspect {
	private Logger myLogger = Logger.getLogger(getClass().getName()); 
	@Around("com.learnspring.aopdemo03rethrow.around.aspect.AOPExpressions.forServicePackageWithoutSetterAndGetter()")
	public Object addLoggingAspect(ProceedingJoinPoint joinPoint) throws Throwable{
		myLogger.info("Inside MyLoggingAspect Aspect " + joinPoint.getSignature().toShortString());
		
		Object result = null;
		try {
			result = joinPoint.proceed();
			return result;
		} catch (Exception e) {
			myLogger.warning(e.getMessage());
			throw e;
		}
	}
}

