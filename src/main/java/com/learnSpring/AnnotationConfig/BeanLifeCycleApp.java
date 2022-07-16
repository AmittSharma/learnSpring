package com.learnSpring.AnnotationConfig;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleApp {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("annotationConfigAppContext.xml");

		Coach cricketCoach = context.getBean("cricketCoach", CricketCoach.class);
		
		System.out.println("Workout for today: "+ cricketCoach.getDailyWorkout());

		context.close();



	}

}
