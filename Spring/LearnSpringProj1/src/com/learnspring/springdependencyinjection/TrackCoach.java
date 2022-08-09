package com.learnspring.springdependencyinjection;

public class TrackCoach implements Coach {

	private FortuneTeller fortuneService;
	
	public TrackCoach(FortuneTeller fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	public TrackCoach() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5K";
	}

	@Override
	public String showFortune() {
		// TODO Auto-generated method stub
		return "Just Do It : " + fortuneService.showFortune();
	}

}
