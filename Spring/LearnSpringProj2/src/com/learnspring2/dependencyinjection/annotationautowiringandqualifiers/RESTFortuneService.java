package com.learnspring2.dependencyinjection.annotationautowiringandqualifiers;

import org.springframework.stereotype.Component;

@Component
public class RESTFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "My luck depends on REST service!! Yo! Yo!";
	}

}
