package com.demo.coach;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	private String email;
	private String name;

	@Override
	public String getDailyWorkout() {
		return "daily do batting for 4 hours";
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setFortuneService(FortuneService theFortuneService) {
		this.fortuneService = theFortuneService;
	}

	@Override
	public String getDailyFortune() {
		return "Cricket " + this.fortuneService.getFortune() ;
	}
}
