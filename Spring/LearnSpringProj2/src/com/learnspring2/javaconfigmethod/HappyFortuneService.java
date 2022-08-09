package com.learnspring2.javaconfigmethod;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Beware of wolf dressed in sheep's cloths.";
	}

}
