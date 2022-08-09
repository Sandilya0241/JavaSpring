package com.learnspring.learningactivity2;

public class BaseballCoach3 implements Coach3 {
	
	private FortuneTeller3 fortuneService;
	
	public BaseballCoach3() {
	}
	
	public BaseballCoach3(FortuneTeller3 fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Practice pitching daily 30 mins";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getTodayFortune();
	}

}
