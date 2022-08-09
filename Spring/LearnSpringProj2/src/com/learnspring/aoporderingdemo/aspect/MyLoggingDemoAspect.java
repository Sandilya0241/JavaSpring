package com.learnspring.aoporderingdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Order(7)
@Aspect
@Component
public class MyLoggingDemoAspect {
	@Before("com.learnspring.aoporderingdemo.aspect.AOPExpressions.aspectForAOPOrderingWithNoGetterSetter()")
	public void beforeAspect() {
		System.out.println("==>> EXEECUTION ASPECT ... inside MyLoggingDemoAspect.beforeAspect");
	}
}
