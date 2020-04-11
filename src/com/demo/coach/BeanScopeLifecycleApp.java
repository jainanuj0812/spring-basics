package com.demo.coach;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeLifecycleApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("beanScopeApplicationContext.xml");
			
			// retrieve bean from spring container
			// Coach theCoach = context.getBean("myCoach", Coach.class);
			
			Coach theCoach = context.getBean("myCoach", Coach.class);
			Coach alphaCoach = context.getBean("myCoach", Coach.class);
			System.out.println(theCoach == alphaCoach);;
			
			// call methods on bean
			System.out.println(theCoach.getDailyWorkout());
			System.out.println(theCoach.getDailyFortune());
			
			
			// close context
			context.close();
	}

}
