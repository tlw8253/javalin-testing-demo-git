package com.javalin.apps;

import io.javalin.http.BadRequestResponse;
import io.javalin.http.Context;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
 * This class was taken by following instruction on the Javalin page on test tutorial https://javalin.io/tutorials/testing
 * 	Code example taken from GIT Clone of https://github.com/tipsy/javalin-testing-example.git
 * 	Source code from example are modified for this project
 */
public class UserController {
	private static String sClass = "UserController{}: ";
	private final static Logger objLogger = LoggerFactory.getLogger(UserController.class);

    static List<String> users = new ArrayList<>(Arrays.asList("User1", "User2", "User3"));

    public static void create(Context ctx) {
		String sMethod = "create(): ";
		String sLogMsgHdr = sClass + sMethod;
		
		objLogger.info(sLogMsgHdr + "Entered:");

		String username = ctx.queryParam("username");
        if (username == null || username.length() < 5) {
            throw new BadRequestResponse();
        } else {
            users.add(username);
            ctx.status(201);
        }
    }

    public static void getAll(Context ctx) {
		String sMethod = "getAll(): ";
		String sLogMsgHdr = sClass + sMethod;
		
		objLogger.info(sLogMsgHdr + "Entered:");

		ctx.json(users);
    }

    public static List<String> getUserList(){return(users);}
}

