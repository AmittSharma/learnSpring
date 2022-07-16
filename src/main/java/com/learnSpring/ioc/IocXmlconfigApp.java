package com.learnSpring.ioc;

import org.springframework.beans.BeansException;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ch.qos.logback.core.Context;

public class IocXmlconfigApp {

	public static void main(String[] args) {

		/*
		 * Steps: 
		 * create the spring container (context) 
		 * get the object from container
		 * call the method using object
		 * close the context
		 */
		try {
			ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

			Coach myCoach = context.getBean("myCoachForIoC", Coach.class);

			System.out.println(""+myCoach.getDailyWorkout());
			
			context.close();
			
		} catch (BeansException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
		
		}
		/*
		 * now if you want to change the implementation of myCoach from trackCoach to
		 * cricketCoach you just need to change it in xml config and NOT in the source
		 * code.
		 */
	}

}
