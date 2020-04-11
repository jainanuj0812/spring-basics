package com.annotation.coach;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("thatSillyCoach") // default ID is tennisCoach
@Scope("singleton") //prototype. global all other options are there
public class TennisCoach implements Coach {
	
	
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;

	/*
	 * @Autowired public TennisCoach(FortuneService theFortuneService) {
	 * this.fortuneService = theFortuneService; }
	 */
	
	/*
	 * @Autowired public void setFortuneService(FortuneService theFortuneService) {
	 * this.fortuneService = theFortuneService; }
	 */
	
	@PostConstruct
	public void doStuff() {
		System.out.println("Init post construct called");
	}

	@PreDestroy
	public void doCleanStuff() {
		System.out.println("Pre Destroy called");
	}
	
	@Override
	public String getDailyWorkout() {
		return "Back hand shot practice";
	}

	@Override
	public String getDailyFortune() {
		return this.fortuneService.getDailyFortune();
	}
}
