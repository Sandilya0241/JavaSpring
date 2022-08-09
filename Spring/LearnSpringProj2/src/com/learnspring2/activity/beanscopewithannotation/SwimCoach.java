package com.learnspring2.activity.beanscopewithannotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SwimCoach implements Coach {

	@Autowired
	private FortuneService fortuneService;
	
	@Override
	public String getDailyWorkout() {
		return "Practice bowling and batting well.";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
