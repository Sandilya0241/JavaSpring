package com.learnspring2.beanlifecycleusingannotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach {

	@Autowired
	private FortuneService fortuneService;

	public BaseballCoach() {
		System.out.println(">>> Inside BaseballCoach arguments.");
	}
	
	@Override
	public String getDailyWorkout() {
		return "Practice batting 4 hours daily";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	@PostConstruct
	public void doMyInitStuff() {
		System.out.println("Inside doMyInitStuff");
		
	}
	
	@PreDestroy
	public void doMyDestroyStuff() {
		System.out.println("Inside doMyDestroyStuff");
	}
	
}
