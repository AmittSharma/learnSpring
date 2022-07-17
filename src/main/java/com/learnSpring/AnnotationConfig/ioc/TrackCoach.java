package com.learnSpring.AnnotationConfig.ioc;

import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach {

	public String getDailyWorkout() {
		return "Run 5k";
	}

}
