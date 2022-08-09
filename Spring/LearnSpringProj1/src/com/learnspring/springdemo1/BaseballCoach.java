package com.learnspring.springdemo1;

public class BaseballCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Spend 30 mins daily on batting";
	}

}
