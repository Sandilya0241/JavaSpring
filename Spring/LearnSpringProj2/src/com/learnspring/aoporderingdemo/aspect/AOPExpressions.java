package com.learnspring.aoporderingdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AOPExpressions {
	@Pointcut("execution (* com.learnspring.aoporderingdemo.dao.*.*(..))")
	public void aspectForAOPOrdering() {};
	
	@Pointcut("execution (* com.learnspring.aoporderingdemo.dao.*.*set(..))")
	public void aspectForSetter() {};
	
	@Pointcut("execution (* com.learnspring.aoporderingdemo.dao.*.*get(..))")
	public void aspectForGetter() {};
	
	@Pointcut("aspectForAOPOrdering() && !(aspectForSetter() || aspectForGetter())") 
	public void aspectForAOPOrderingWithNoGetterSetter() {};
}
