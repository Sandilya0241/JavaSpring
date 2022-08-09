package com.learnspring2.annotations.beanscopewithcustomprocessor;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {
		//SpringConfigAnnotationsBeanscope.xml
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("SpringConfigAnnotationsBeanscopeWithCustomProcessor.xml");
		
		Coach theCoach = context.getBean("golfCoach", Coach.class);
		Coach theCoach2 = context.getBean("golfCoach", Coach.class);
	
		
		
		context.close();
	}

}
