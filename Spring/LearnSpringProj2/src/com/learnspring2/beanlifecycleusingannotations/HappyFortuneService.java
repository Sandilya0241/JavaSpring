package com.learnspring2.beanlifecycleusingannotations;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Today is the luckiest day";
	}

}
