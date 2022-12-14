package com.learnspring2.dependencyinjection.annotationautowiringandqualifiers;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	private String data[] = {"Beware of the wolf in sheep's clothing",
			"Diligence of the mother of good luck",
			"The journey is the reward"};
	
	private Random random = new Random();
	
	@Override
	public String getFortune() {
		int index = random.nextInt(data.length);
		return data[index];
	}

}
