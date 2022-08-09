package com.learnspring2.injectvaluesfromproperties;

public class SadFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Today is a very SAD day";
	}

}
