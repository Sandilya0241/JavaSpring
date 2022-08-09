package com.learnspring2.annotations.beanscope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class GolfCoach implements Coach {

	@Autowired
	private FortuneService fortuneService;
	
	public GolfCoach() {
		System.out.println("Inside GolfCoach constructor>>>");
	}
	
	@Override
	public String getDailyWorkout() {
		return "Practice golf well";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
