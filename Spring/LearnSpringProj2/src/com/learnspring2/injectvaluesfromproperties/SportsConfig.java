package com.learnspring2.injectvaluesfromproperties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:sports_new.properties")
public class SportsConfig {
	//define bean for our SadFortuneService
	
	@Bean
	public FortuneService sadFortuneService() {
		return new SadFortuneService();
	}
	
	// define Bean for our RugbyCoach and dependency injection
	@Bean
	public Coach footballCoach() {
		return new FootballCoach(sadFortuneService());
	}

}
