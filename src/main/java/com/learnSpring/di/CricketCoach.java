package com.learnSpring.di;

public class CricketCoach implements Coach{
	
	/* We need to add constructor DI here */
	private FortuneService fortuneService;
	
	public CricketCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	public String getDailyWorkout() {
		return "Practice straight drive for 40 minutes.";
	}

	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
