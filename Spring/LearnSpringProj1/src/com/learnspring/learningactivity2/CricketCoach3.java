package com.learnspring.learningactivity2;

import org.springframework.beans.factory.DisposableBean;

public class CricketCoach3 implements Coach3, DisposableBean {

	private FortuneTeller3 fortuneService;
	
	public CricketCoach3() {}
	
	public CricketCoach3(FortuneTeller3 fortuneService) {
		this.fortuneService = fortuneService;
	}	
	
	@Override
	public String getDailyWorkout() {
		return "Learn week areas in batting and bowling in Cricket";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getTodayFortune();
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Destroy method of Cricket Coach");
	}

	
	
}
