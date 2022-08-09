package com.learnspring.destroy_prototype_scope_bean_with_custom_processor;

import org.springframework.beans.factory.DisposableBean;

public class BaseballCoach2 implements Coach2, DisposableBean {
	// add private variables for dependencies
	private FortuneTeller2 fortuneService;
	
	public BaseballCoach2() {
		
	}
	
	// add Constructor to set dependencies
	public BaseballCoach2(FortuneTeller2 fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Practice 30 minutes on batting daily";
	}

	public void doMyStartupStuff() {
		System.out.println("Inside BaseballCoach : Init-method");
	}
	
	@Override
	public void destroy() throws Exception{
		System.out.println("Inside BaseballCoach : destroy-method");
	}

	@Override
	public String getDailyFortune() {
		return "Luck favors brave. Go ahead test you luck.";
	}
	
}
