package com.learnspring2.dependencyinjection.constructorinjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {
		// Read Spring Config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("SpringConfigDependencyInjectionConstructor.xml");
		
		// get the Bean from Spring container
		Coach theCricketCoach = context.getBean("cricketCoach", Coach.class);
		
		
		// Call a method on the bean
		System.out.println(theCricketCoach.getDailyWorkout());
		
		//Call methods from injected dependencies
		System.out.println(theCricketCoach.getDailyFortune());
		
		// close the context
		context.close();
	}

}
