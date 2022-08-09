package com.learnspring2.project_one;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		// Read Spring Config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("SpringConfig.xml");
		
		// get the Bean from Spring container
		Coach theCoach = (Coach)context.getBean("theBasketballCoach1", Coach.class);
		Coach theCricketCoach = (Coach)context.getBean("cricketCoach", Coach.class);
		
		
		// Call a method on the bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCricketCoach.getDailyWorkout());
		
		// close the context
		context.close();
	}

}
