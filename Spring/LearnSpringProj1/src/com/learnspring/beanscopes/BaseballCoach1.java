package com.learnspring.beanscopes;

public class BaseballCoach1 implements Coach1 {

	private FortuneTeller1 fortuneService;
	
	public BaseballCoach1(FortuneTeller1 fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Practice Pitching and Batting as well";
	}

	@Override
	public String getTodayFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getTodayFortune();
	}

	
	// add an init method
	public void doMyStartupStuff() {
		System.out.println("Inside Baseball coach : init-method");
	}
	
	// add a destroy method
	public void doMyCleanupStuff() {
		System.out.println("Inside Baseball coach : destroy-method");
	}
}
