package com.learnspring2.activity.iocanddiwithjavaconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppDemo {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportsConfig.class);
		
		
		Coach theCoach = context.getBean("wrestlingCoach", Coach.class);
		
		System.out.println(theCoach.getDailyWorkout());
		
		System.out.println(theCoach.getDailyFortune());
		
		context.close();

	}

}
