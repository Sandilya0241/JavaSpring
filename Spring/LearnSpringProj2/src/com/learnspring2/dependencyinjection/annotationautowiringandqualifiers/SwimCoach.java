package com.learnspring2.dependencyinjection.annotationautowiringandqualifiers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SwimCoach implements Coach {

	@Value("${foo.email}")
	private String Email;
	
	@Value("${foo.team}")
	private String TeamName;
	
	@Autowired
	@Qualifier("RESTFortuneService")
	private FortuneService fortuneService;
	
	@Override
	public String getDailyWorkout() {
		return "Practice back strokes more";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
	public void printPropertyValues() {
		System.out.println(Email);
		System.out.println(TeamName);
	}

}
