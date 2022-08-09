package com.learnspring2.dependencyinjection.annotationautowiringandqualifiers;

import org.springframework.stereotype.Component;

@Component
public class BestFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "This is best fortune service";
	}

}
