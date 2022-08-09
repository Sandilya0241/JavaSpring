package com.learnspring.springdemo1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		try {
			// load the spring configuration file.
			ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("./resources/applicationContext.xml");
			
			
			
			// retrieve bean from spring container.
			Coach theCoach = (Coach)context.getBean("myCoach", Coach.class);
			// call methods on the bean.
			System.out.println(theCoach.getDailyWorkout());
			// close the context.
			context.close();
		} catch (Exception e) {
			
			
			e.printStackTrace();
		}
		
	}
}
