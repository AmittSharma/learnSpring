package com.learnSpring.xmlConfig.di;

public class TrackCoach implements Coach {

	private String teamName;
	private String email;
	private FortuneService fortuneService;
	
	/* setter for DI */
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDailyWorkout() {
		return "Run 5k";
	}

	public String getDailyFortune() {
		return "Fortune by your Track Coach: "+fortuneService.getFortune();
	}

}
