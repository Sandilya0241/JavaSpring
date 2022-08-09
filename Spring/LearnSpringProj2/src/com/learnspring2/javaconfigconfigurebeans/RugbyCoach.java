package com.learnspring2.javaconfigconfigurebeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class RugbyCoach implements Coach {

	private FortuneService fortuneService;
	
	public RugbyCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyFortune() {
		return "Practice Penality kicks well";
	}

	@Override
	public String getDailyWorkout() {
		return fortuneService.getFortune();
	}

}
