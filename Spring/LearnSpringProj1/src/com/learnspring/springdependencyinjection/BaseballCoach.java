package com.learnspring.springdependencyinjection;

public class BaseballCoach implements Coach {
	
	//define a private field for dependency 
	private FortuneTeller fortuneTellerService;
	
	//define a constructor for dependency injection
	public BaseballCoach(FortuneTeller fortuneTellerService) {
		this.fortuneTellerService = fortuneTellerService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Spend 30 mins daily on batting";
	}

	@Override
	public String showFortune() {
		return fortuneTellerService.showFortune();
	}

}
