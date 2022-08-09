package com.learnspring2.injectvaluesfromproperties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

public class FootballCoach implements Coach {

	private FortuneService fortuneService;
	
	@Value("${foo.email}")
	private String emailAddress;
	
	@Value("${foo.team}")
	private String teanName;
	
	
	public String getEmailAddress() {
		return emailAddress;
	}

	public String getTeanName() {
		return teanName;
	}

	
	public FootballCoach(FortuneService fortuneService) {
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
