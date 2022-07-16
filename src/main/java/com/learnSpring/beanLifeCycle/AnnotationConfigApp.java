package com.learnSpring.beanLifeCycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationConfigApp {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifecycleAppContext.xml");

		Coach cricketCoach = context.getBean("myCoachForBeanLifecycle", CricketCoach.class);
		
		System.out.println("Workout for today: "+ cricketCoach.getDailyWorkout());

		context.close();



	}

}
