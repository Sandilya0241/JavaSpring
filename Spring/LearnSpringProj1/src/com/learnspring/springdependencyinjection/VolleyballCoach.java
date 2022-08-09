package com.learnspring.springdependencyinjection;

public class VolleyballCoach implements Coach {

	// creating object for dependency injection
	private FortuneTeller fortuneService;
	
	// creating private objects for Literals injection
	private String emailAddress, team;
	
	public VolleyballCoach() {
		System.out.println("Team volley ball coach constructor");
	}
	@Override
	public String getDailyWorkout() {
		return "Practice smash all day";
	}

	@Override
	public String showFortune() {
		return "Slightly disturbed... But rest all fine";
	}
	public void setFortuneService(FortuneTeller fortuneService) {
		this.fortuneService = fortuneService;
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
