package com.learnspring2.activity.iocanddiwithjavaconfig;

public class LuckyFortuneService implements FortuneService {
	@Override
	public String getFortune() {
		return "Luck favors brave. Be brave and strong.";
	}
}
