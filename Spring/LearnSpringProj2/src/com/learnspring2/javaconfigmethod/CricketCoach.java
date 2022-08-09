package com.learnspring2.javaconfigmethod;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component

public class CricketCoach implements Coach {

	@Autowired
	private FortuneService fortuneService;
	
	@Override
	public String getDailyFortune() {
		return "Practice batting and bowling";
	}

	@Override
	public String getDailyWorkout() {
		return fortuneService.getFortune();
	}

}
