package com.learnspring.aopdemo02.around.service;

import java.util.concurrent.TimeUnit;

import org.springframework.stereotype.Component;

@Component
public class TrafficFortuneService {
	public String fetchFortune() {
		
		try {
			TimeUnit.SECONDS.sleep(5);
		} catch (InterruptedException ie) {
			ie.printStackTrace();
		}
		
		return "Traffic is too heavy";
	}
}
