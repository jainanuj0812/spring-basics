package com.annotation.coach;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {
	
	@Value("${foo.email}")
	public String email;
	
	@Value("${foo.name}")
	public String name;

	public String getEmail() {
		return email;
	}

	public String getName() {
		return name;
	}

	private FortuneService fortuneService;

	public SwimCoach(FortuneService theFortuneService) {
		this.fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Swim 100 meters";
	}

	@Override
	public String getDailyFortune() {
		return this.fortuneService.getDailyFortune();
	}

}
