package com.learnspring2.injectvaluesfromproperties;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemoApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportsConfig.class);
		
		FootballCoach theCoach = context.getBean("footballCoach", FootballCoach.class);

		System.out.println(theCoach.getDailyWorkout());
		
		
		System.out.println(theCoach.getEmailAddress());
		
		System.out.println(theCoach.getTeanName());
		
		System.out.println(theCoach.getDailyFortune());
		
		context.close();
	}
	

}
