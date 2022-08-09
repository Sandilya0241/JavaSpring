package com.learnspring2.annotations.beanscopewithcustomprocessor;

import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class GolfCoach implements Coach, DisposableBean {

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

	
	@Override
	public void destroy() throws Exception {
		System.out.println(">>> Destroy clean up");
		
	}
}
