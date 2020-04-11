package com.demo.coach;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringCoachApp {

	public static void main(String[] args) {
		// load spring conf file
		ClassPathXmlApplicationContext context =
			new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve bean from spring container
		// Coach theCoach = context.getBean("myCoach", Coach.class);
		
		CricketCoach theCoach = context.getBean("myCoach", CricketCoach.class);
		
		// call methods on bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		System.out.println(theCoach.getEmail());
		System.out.println(theCoach.getName());
		
		
		// close context
		context.close();
	}

}
