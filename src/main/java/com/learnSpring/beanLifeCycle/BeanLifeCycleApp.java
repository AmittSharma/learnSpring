package com.learnSpring.beanLifeCycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleApp {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifecycleAppContext.xml");

		Coach cricketCoach = context.getBean("myCoachForBeanLifecycle", CricketCoach.class);
		
		System.out.println("Workout for today: "+ cricketCoach.getDailyWorkout());

		context.close();



	}

}
