package com.learnspring2.activity.iocanddiwithjavaconfig;

public class WrestlingCoach implements Coach {

	private FortuneService fortuneService;
	
	public WrestlingCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Do workout 4 hours and eat 30 eggs";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
