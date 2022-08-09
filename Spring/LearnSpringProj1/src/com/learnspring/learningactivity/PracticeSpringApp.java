package com.learnspring.learningactivity;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PracticeSpringApp {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("./resources/applicationContext_LearningActivity.xml");
		Coach theCoach = (Coach)context.getBean("myCoach", Coach.class);
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getTodayFortune());
		context.close();
	}
}
