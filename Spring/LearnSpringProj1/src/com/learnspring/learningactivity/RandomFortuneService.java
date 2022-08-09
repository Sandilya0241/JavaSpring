package com.learnspring.learningactivity;

import java.util.Random;

public class RandomFortuneService implements FortuneTeller {

	@Override
	public String getTodayFortune() {
		Random rand = new Random();
		return fortuneValues[rand.nextInt(fortuneValues.length)];
	}

}
