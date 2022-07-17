package com.learnSpring.xmlConfig.di;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConstructorDiXmlConfigApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach myCoach = context.getBean("myCoachForDi", Coach.class);
		
		System.out.println(myCoach.getDailyWorkout());
		System.out.println(myCoach.getDailyFortune());
		
		
		

	}

}
