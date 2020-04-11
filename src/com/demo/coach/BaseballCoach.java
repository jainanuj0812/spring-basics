package com.demo.coach;

public class BaseballCoach implements Coach{
	
	private FortuneService fortuneService;

	BaseballCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "spend 30 mins in workout";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
}
