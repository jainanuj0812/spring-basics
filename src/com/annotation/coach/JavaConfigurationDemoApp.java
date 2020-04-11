package com.annotation.coach;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigurationDemoApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(SportsConfig.class);
		
		SwimCoach theCoach = context.getBean("swimCoach", SwimCoach.class);
		
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.email);
		System.out.println(theCoach.name);
		
		System.out.println(theCoach.getDailyFortune());
		
		context.close();
		
	}

}
