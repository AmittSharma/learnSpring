package com.learnSpring.beanLifeCycle;

public class CricketCoach implements Coach {
	
	public String getDailyWorkout() {
		return "Complete 12 rounds of ground.";
	}
	
	/* Add your custom init method */
	public void myInitMethod() {
		System.out.println("CricketCoach bean instantiated.");
	}
	
	/* Add your custom destroy method */
	public void myDestroyMethod() {
		System.out.println("CricketCoach bean destroyed.");
	}

}
