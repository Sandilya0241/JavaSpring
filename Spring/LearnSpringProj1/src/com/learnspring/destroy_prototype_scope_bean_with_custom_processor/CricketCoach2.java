package com.learnspring.destroy_prototype_scope_bean_with_custom_processor;

public class CricketCoach2 implements Coach2 {

	// Add private variable for dependency
	private FortuneTeller2 fortuneService;
	
	public CricketCoach2() {
	}

	public CricketCoach2(FortuneTeller2 fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Practice more on shot technique";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getTodayFortune();
	}

	public void doMyStartupStuff2() {
		System.out.println("Cricket Coach init method");
	}
	
	
	public void myDestroyStuff() {
		System.out.println("Cricket Coach destroy method");
	}
}
