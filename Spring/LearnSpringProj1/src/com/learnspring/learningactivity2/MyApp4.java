package com.learnspring.learningactivity2;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp4 {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("./resources/applicationContext_LearningActivity2.xml");
		
		
		Coach3 theCoach = (Coach3)context.getBean("myCoach", Coach3.class);
		
		Coach3 theCricCoach = (Coach3)context.getBean("myCricCoach", Coach3.class);
		
		
		
		context.close();
	}
}
