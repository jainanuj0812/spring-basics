package com.annotation.coach;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
// @ComponentScan("com.annotation.coach")
@PropertySource("classpath:sports.properties")
public class SportsConfig {
	
	@Bean
	public FortuneService randomFortuneService() {
		return new RandomFortuneService();
	}
	
	@Bean
	public Coach swimCoach() {
		return new SwimCoach(randomFortuneService());
	}
}