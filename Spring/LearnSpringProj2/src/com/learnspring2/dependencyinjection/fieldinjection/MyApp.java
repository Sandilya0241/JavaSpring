package com.learnspring2.dependencyinjection.fieldinjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MyApp {

	public static void main(String[] args) {
		// Read Spring Config file
				ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("SpringConfigDependencyInjectionField.xml");
				
				Coach theTennisCoach = context.getBean("tennisCoach", Coach.class);
				
				// Call a method on the bean
				System.out.println(theTennisCoach.getDailyWorkout());
				
				//Call methods from injected dependencies
				System.out.println(theTennisCoach.getDailyFortune());
				
				// close the context
				context.close();
	}

}
