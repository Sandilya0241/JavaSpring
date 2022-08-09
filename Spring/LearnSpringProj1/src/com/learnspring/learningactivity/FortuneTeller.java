package com.learnspring.learningactivity;

public interface FortuneTeller {
	String[] fortuneValues = new String[] {"Today is a lucky day", "It looks fine. Be careful", "Today is a misfortune, please be careful"};
	public String getTodayFortune();
}
