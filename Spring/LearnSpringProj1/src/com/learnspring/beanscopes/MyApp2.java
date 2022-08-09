package com.learnspring.beanscopes;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp2 {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("./resources/beanLifeCycle-applicationContext.xml");
		Coach1 theCoach = (Coach1)context.getBean("myCoach1", Coach1.class);
		System.out.println(theCoach.getDailyWorkout());
		context.close();
	}

}
