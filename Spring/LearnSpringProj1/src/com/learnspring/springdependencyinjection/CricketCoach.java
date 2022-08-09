package com.learnspring.springdependencyinjection;

public class CricketCoach implements Coach {

	private FortuneTeller fortuneService;
	
	//add private fields for Literal injection
	private String emailAddress, team;
	
	public CricketCoach() {
		System.out.println("CricketCoach: inside no-arg constructor");
	}
	
	public void setFortuneService(FortuneTeller fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Workout on concentration and technique";
	}

	@Override
	public String showFortune() {
		return "Hey Cricket Coach : " + fortuneService.showFortune();
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

}
