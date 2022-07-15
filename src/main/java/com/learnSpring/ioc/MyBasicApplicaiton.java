package com.learnSpring.ioc;

public class MyBasicApplicaiton {

	public static void main(String[] args) {
		
		/* This is the basic what we can do */

		CricketCoach coach = new CricketCoach();
		System.out.println("Workout without interface: "+coach.getDailyWorkout());
		
		/* But we should code it to an interface */
		
//		Coach coachInterface = new CricketCoach();
		/* if you need a different coach */
		Coach coachInterface = new TrackCoach();
		System.out.println("Workout with interface: "+coachInterface.getDailyWorkout());
		
		/* NOTE: this is still a hard-coded code */
	
	}

}
