package com.learnspring.aopdemo03.around;

import java.util.logging.Logger;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.learnspring.aopdemo03.around.service.TrafficFortuneService;

public class AOPAroundDemoMain {

	private static Logger myLogger = Logger.getLogger(AOPAroundDemoMain.class.getName());
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AOPAroundDemoConfig.class);
		
		TrafficFortuneService bean = context.getBean("trafficFortuneService", TrafficFortuneService.class);
		
		myLogger.info("\nInside Main program...");
		myLogger.info("Calling Fortune service");
		
		
		boolean tripWire = true;
		String data = bean.fetchFortune(tripWire);
		
		myLogger.info("Fortune Data " + data);
		myLogger.info("Finished");
		context.close();
	}

}
