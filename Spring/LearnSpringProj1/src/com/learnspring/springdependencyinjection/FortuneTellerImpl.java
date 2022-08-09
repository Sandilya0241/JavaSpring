package com.learnspring.springdependencyinjection;

public class FortuneTellerImpl implements FortuneTeller {

	@Override
	public String showFortune() {
		return "Today is your lucky day";
	}

}
