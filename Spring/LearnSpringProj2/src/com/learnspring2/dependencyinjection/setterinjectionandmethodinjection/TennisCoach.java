package com.learnspring2.dependencyinjection.setterinjectionandmethodinjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

	private FortuneService fortuneService;
	
	@Autowired
	public void doMyStuff(FortuneService fortuneService) {
		System.out.println("TennisCoach doMyStuff >> ");
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Practice backhand well";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
