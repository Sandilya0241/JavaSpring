package com.learnspring2.dependencyinjection.annotationautowiringandqualifiers;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {
		// Read Spring Config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("SpringConfigAnnotationAutowiringAndQualifiers.xml");
		
		System.out.println("Creating CricketCoach bean");
		Coach theCricketCoach = context.getBean("cricketCoach", Coach.class);
		System.out.println(theCricketCoach.getDailyWorkout());
		System.out.println(theCricketCoach.getDailyFortune());
		System.out.println("Completed working with CricketCoach bean");
		
		System.out.println("Creating TennisCoach bean");
		Coach theTennisCoach = context.getBean("tennisCoach", Coach.class);
		System.out.println(theTennisCoach.getDailyWorkout());
		System.out.println(theTennisCoach.getDailyFortune());
		System.out.println("Completed working with TennisCoach bean");
		
		
		System.out.println("Creating SwimCoach bean");
		SwimCoach theSwimCoach = context.getBean("swimCoach", SwimCoach.class);
		System.out.println(theSwimCoach.getDailyWorkout());
		System.out.println(theSwimCoach.getDailyFortune());
		theSwimCoach.printPropertyValues();
		System.out.println("Completed working with SwimCoach bean");
		
		
		context.close();
	}

}
