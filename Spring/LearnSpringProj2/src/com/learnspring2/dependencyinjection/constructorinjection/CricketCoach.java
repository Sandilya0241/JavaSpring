package com.learnspring2.dependencyinjection.constructorinjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {

	//adding private members to hold dependencies
	private FortuneService fortuneService;
	
	
	//Below annotation will help injecting dependencies
	@Autowired
	public CricketCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Practice more bowling";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	

}
