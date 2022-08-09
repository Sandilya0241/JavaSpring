package com.learnspring2.dependencyinjection.setterinjectionandmethodinjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {

	//adding private members to hold dependencies
	private FortuneService fortuneService;
	
	
	//Below annotation will help injecting dependencies
	
	public CricketCoach() {
		System.out.println("Bean created.. Inside default constructor");
	}
	
	@Autowired
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Bean created.. Inside Setter method");
		this.fortuneService = fortuneService;
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
