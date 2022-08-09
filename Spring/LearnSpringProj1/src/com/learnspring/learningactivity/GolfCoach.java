package com.learnspring.learningactivity;

public class GolfCoach implements Coach {

	//private variable for dependencies
	private FortuneTeller fortuneService;
	
	
	
	@Override
	public String getDailyWorkout() {
		return "Practice more on accuracy";
	}



	public void setRandomFortuneService(FortuneTeller fortuneService) {
		this.fortuneService = fortuneService;
	}



	@Override
	public String getTodayFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getTodayFortune();
	}

}
