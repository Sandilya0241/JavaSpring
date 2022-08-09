package com.learnspring.aopdemo03.around.service;

import java.util.concurrent.TimeUnit;

import org.springframework.stereotype.Component;

@Component
public class TrafficFortuneService {
	public String fetchFortune(boolean tripWire) {
		if(tripWire) {
			throw new RuntimeException("This is very dangerous exception!!! Handle it carefully!!!");
		}
		try {
			TimeUnit.SECONDS.sleep(5);
		} catch (InterruptedException ie) {
			ie.printStackTrace();
		}
		
		return "Traffic is too heavy";
	}
}
