package com.learnspring.springdependencyinjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp2 {

	public static void main(String[] args) {
		try {
			// load the spring configuration file.
			ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("./resources/DependencyInjectionApplicationContext2.xml");
			
			
			
			// retrieve bean from spring container.
			CricketCoach theCoach = (CricketCoach)context.getBean("myCricketCoach", CricketCoach.class);
			// call methods on the bean.
			System.out.println(theCoach.getDailyWorkout());
			
			//calling dependency methods
			System.out.println(theCoach.showFortune());
			
			//call literal values set from application config
			System.out.println("Coach Email Address : " + theCoach.getEmailAddress());
			System.out.println("Coach Team Name : " + theCoach.getTeam());
			
			// close the context.
			context.close();
		} catch (Exception e) {			
			e.printStackTrace();
		}
		
	}
}
