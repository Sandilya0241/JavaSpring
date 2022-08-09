package com.learnspring.destroy_prototype_scope_bean_with_custom_processor;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("./resources/DestroyPrototypeScopeBeanWithCustomProcessor.xml");
		Coach2 theCoach = (Coach2)context.getBean("myCoach",Coach2.class);
		Coach2 theAlphaCoach = (Coach2)context.getBean("myCoach",Coach2.class);
		Coach2 theCricCoach = (Coach2)context.getBean("myCoach2",Coach2.class);
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach);
		
		System.out.println(theAlphaCoach.getDailyWorkout());
		System.out.println(theAlphaCoach);
		
		System.out.println(theCricCoach.getDailyWorkout());
		System.out.println(theCricCoach);
		context.close();
	}
}
