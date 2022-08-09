package com.learnspring.aoporderingdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.learnspring.aoporderingdemo.dao.AOPOrderingDemoDAO;

public class AOPOrderingMain {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AOPOrderingConfig.class);
		
		AOPOrderingDemoDAO oAOPOrderingDemoDAO = context.getBean("AOPOrderingDemoDAO", AOPOrderingDemoDAO.class);
		
		oAOPOrderingDemoDAO.addAccount();
		
		context.close();
	}

}
