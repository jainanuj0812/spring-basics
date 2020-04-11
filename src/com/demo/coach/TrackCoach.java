package com.demo.coach;

public class TrackCoach implements Coach{
	
	private FortuneService fortuneService;

	TrackCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "spend 30 mins in running";
	}

	@Override
	public String getDailyFortune() {
		return "Just do it "+ fortuneService.getFortune();
	}
	
	public void doStartupStuff() {
		System.out.println("Init called");
	}
	
	public void doCleanupStuff() {
		System.out.println("Destory called");
	}
}
