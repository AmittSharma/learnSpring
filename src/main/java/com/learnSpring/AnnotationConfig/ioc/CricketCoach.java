package com.learnSpring.AnnotationConfig.ioc;

import org.springframework.stereotype.Component;

/*use below line to use a explicit beanID i.e. annotatedCoach*/
//@Component("annotatedCoach")

/*use below line to use the default beanID i.e. cricketCoach*/
@Component
public class CricketCoach implements Coach{

	public String getDailyWorkout() {
		return "Practice reverse swing today.";
	}

}
