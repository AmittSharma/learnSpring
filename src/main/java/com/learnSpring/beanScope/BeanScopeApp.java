package com.learnSpring.beanScope;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeApp {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScopeAppContext.xml");

		Coach juniorCricketCoach = context.getBean("myCoachForSingletonBean", CricketCoach.class);

		Coach seniorCricketCoach = context.getBean("myCoachForSingletonBean", CricketCoach.class);

		System.out.println("===================================================================");
		System.out.println("Are juniorCricketCoach & seniorCricketCoach same: " + (juniorCricketCoach == seniorCricketCoach));

		System.out.println("Memory location for juniorCricketCoach: "+ juniorCricketCoach);

		System.out.println("Memory location for seniorCricketCoach: "+ seniorCricketCoach);
		
		System.out.println("===================================================================");


		Coach juniorTrackCoach = context.getBean("myCoachForPrototypeBean", TrackCoach.class);

		Coach seniorTrackCoach = context.getBean("myCoachForPrototypeBean", TrackCoach.class);

		System.out.println("Are juniorTrackCoach & seniorTrackCoach same: " + (juniorTrackCoach == seniorTrackCoach));

		System.out.println("Memory location for juniorTrackCoach: "+ juniorTrackCoach);

		System.out.println("Memory location for seniorTrackCoach: "+ seniorTrackCoach);
		
		System.out.println("===================================================================");

		context.close();



	}

}
