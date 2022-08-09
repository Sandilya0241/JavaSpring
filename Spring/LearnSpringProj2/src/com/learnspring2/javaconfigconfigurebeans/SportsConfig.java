package com.learnspring2.javaconfigconfigurebeans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportsConfig {
	//define bean for our SadFortuneService
	
	@Bean
	public FortuneService sadFortuneService() {
		return new SadFortuneService();
	}
	
	// define Bean for our RugbyCoach and dependency injection
	@Bean
	public Coach rugbyCoach() {
		return new RugbyCoach(sadFortuneService());
	}

}
