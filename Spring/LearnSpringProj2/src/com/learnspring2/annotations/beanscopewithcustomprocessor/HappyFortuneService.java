package com.learnspring2.annotations.beanscopewithcustomprocessor;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {

	
	@Override
	public String getFortune() {
		return "Today is your lucky day";
	}

}
