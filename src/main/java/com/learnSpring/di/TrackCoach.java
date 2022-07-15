package com.learnSpring.di;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;
	
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	public String getDailyWorkout() {
		return "Run 5k";
	}

	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
