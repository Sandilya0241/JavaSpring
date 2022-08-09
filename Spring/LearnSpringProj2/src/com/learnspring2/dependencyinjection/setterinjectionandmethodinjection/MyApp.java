package com.learnspring2.dependencyinjection.setterinjectionandmethodinjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MyApp {

	public static void main(String[] args) {
		// Read Spring Config file
				ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("SpringConfigDependencyInjectionSetter.xml");
				
				// get the Bean from Spring container
				Coach theCricketCoach = context.getBean("cricketCoach", Coach.class);
				
				Coach theTennisCoach = context.getBean("tennisCoach", Coach.class);
				
				// Call a method on the bean
				System.out.println(theCricketCoach.getDailyWorkout());
				System.out.println(theTennisCoach.getDailyWorkout());
				
				//Call methods from injected dependencies
				System.out.println(theCricketCoach.getDailyFortune());
				System.out.println(theTennisCoach.getDailyFortune());
				
				// close the context
				context.close();
	}

}
