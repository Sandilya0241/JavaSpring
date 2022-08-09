package com.learnspring.beanscopes;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp1 {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("./resources/beanScope-applicationContext.xml");
		Coach1 theCoach = (Coach1)context.getBean("myCoach1", Coach1.class);
		Coach1 theAlphaCoach = (Coach1)context.getBean("myCoach1", Coach1.class);
		
		boolean result = (theAlphaCoach == theCoach);
		
		System.out.println("\nPlease let me know whether or not both the objects are same? : " + result);
		
		System.out.println("\nMemory location of theAlphaCoach is : " + theAlphaCoach);
		
		System.out.println("\nMemory location of theCoach is : " + theCoach);
	}

}
