package com.learnSpring.di;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDiXmlConfigApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		TrackCoach myCoach = context.getBean("TrackCoachForDi", TrackCoach.class);
		
		System.out.println(myCoach.getDailyWorkout());
		System.out.println(myCoach.getDailyFortune());
		System.out.println(myCoach.getTeamName()); // this we got by literal injection
		
		
		

	}

}
