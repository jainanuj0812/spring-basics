package com.annotation.coach;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationScopeDemoApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("annotationApplicationContext.xml");
		
		Coach theCoach = context.getBean("thatSillyCoach", Coach.class);
		Coach myCoach = context.getBean("thatSillyCoach", Coach.class);
		
		System.out.println(theCoach == myCoach);
		
		context.close();

	}

}
