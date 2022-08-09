package com.learnspring2.project_one;

import org.springframework.stereotype.Component;

@Component("theBasketballCoach1")
public class BasketballCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Practice your slam dunk technique";
	}

}
