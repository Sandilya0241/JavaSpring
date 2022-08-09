package com.learnspring2.dependencyinjection.fieldinjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	
	@Autowired
	private FortuneService fortuneService;

	
	@Override
	public String getDailyWorkout() {
		return "Practice backhand well";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
