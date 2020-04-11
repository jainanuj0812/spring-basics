package com.annotation.coach;

import org.springframework.stereotype.Component;

@Component
public class BadFortune implements FortuneService {

	@Override
	public String getDailyFortune() {
		return "Somethingbad will happen";
	}

}
