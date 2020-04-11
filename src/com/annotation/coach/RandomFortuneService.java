package com.annotation.coach;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	private String[] str = new  String[] {"This is first", "this is second", "this is thrid"}; 
	
	@Override
	public String getDailyFortune() {
		Random ran = new Random();
		int index = ran.nextInt(str.length);		
		return str[index];
	}
}
