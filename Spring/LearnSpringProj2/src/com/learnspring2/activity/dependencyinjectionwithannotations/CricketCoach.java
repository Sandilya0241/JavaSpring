package com.learnspring2.activity.dependencyinjectionwithannotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {

	@Autowired
	private FortuneService fortuneService;
	
	@Override
	public String getDailyWorkout() {
		return "Concentrate on technique.";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
