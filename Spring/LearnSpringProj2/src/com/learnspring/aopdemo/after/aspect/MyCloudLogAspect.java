package com.learnspring.aopdemo.after.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Order(-20)
@Aspect
@Component
public class MyCloudLogAspect {
	@Before("com.learnspring.aopdemo.after.aspect.AOPExpressions.aspectForAOPOrderingWithNoGetterSetter()")
	public void beforeAspect() {
		System.out.println("==>> EXEECUTION ASPECT ... inside MyCloudLogAspect.beforeAspect");
	}
}
