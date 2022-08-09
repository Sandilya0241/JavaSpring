package com.learnspring2.dependencyinjection.constructorinjection;

import org.springframework.stereotype.Component;


// This Component annotation helps Spring to register this bean.
@Component
public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Today is your lucky day "
				+ "Yay!! Yay!!!";
	}

}
