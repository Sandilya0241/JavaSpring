package com.learnspring2.activity.iocanddiwithjavaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportsConfig {
	@Bean
	public FortuneService luckyFortuneService() {
		return new LuckyFortuneService();
	}
	
	
	@Bean
	public Coach wrestlingCoach() {
		return new WrestlingCoach(luckyFortuneService());
	}
}
