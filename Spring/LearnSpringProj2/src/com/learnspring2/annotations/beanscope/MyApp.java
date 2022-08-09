package com.learnspring2.annotations.beanscope;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {
		//SpringConfigAnnotationsBeanscope.xml
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("SpringConfigAnnotationsBeanscope.xml");
		
		Coach theCoach = context.getBean("golfCoach", Coach.class);
		Coach theCoach2 = context.getBean("golfCoach", Coach.class);
	
		boolean result = (theCoach == theCoach2);
		
		System.out.println("The values are same ? " + result);
		
		System.out.println("The theCoach object address : " + theCoach);

		System.out.println("The theCoach2 object address : " + theCoach2);
		
		context.close();
	}

}
