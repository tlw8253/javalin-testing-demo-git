package com.javalin.demo;

import com.javalin.apps.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
 * Driver to test code described in Javalin webpage: https://javalin.io/tutorials/testing
 */
public class Main {
	private static String sClass = "Main{}: ";
	private final static Logger objLogger = LoggerFactory.getLogger(Main.class);
	
	private static JavalinApp objJavalinApp = new JavalinApp(); //Class from Javalin website

	public Main() {
		super();
	}

	public static void main(String[] args) {
		String sMethod = "main(): ";
		String sLogMsgHdr = sClass + sMethod;
		
		objLogger.info(sLogMsgHdr + "Entered:");
		
		objJavalinApp.start(3000);// start the listener

	}

}
