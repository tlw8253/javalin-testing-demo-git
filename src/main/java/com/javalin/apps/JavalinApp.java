package com.javalin.apps;

import io.javalin.Javalin;
import static io.javalin.apibuilder.ApiBuilder.get;
import static io.javalin.apibuilder.ApiBuilder.post;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
 * This class was taken by following instruction on the Javalin page on test tutorial https://javalin.io/tutorials/testing
 * 	Code example taken from GIT Clone of https://github.com/tipsy/javalin-testing-example.git
 * 	Source code from example are modified for this project
 */

public class JavalinApp {
	private static String sClass = "JavalinApp{}: ";
	private final static Logger objLogger = LoggerFactory.getLogger(JavalinApp.class);

    private Javalin app = Javalin.create().routes(() -> {
        get("/users", UserController::getAll);
        post("/users", UserController::create);
        get("/ui", ctx -> ctx.html("<h1>User UI</h1>"));
    });

    public void start(int port) {
		String sMethod = "start(): ";
		String sLogMsgHdr = sClass + sMethod;
		
		objLogger.info(sLogMsgHdr + "Entered:");

		this.app.start(port);
    }

    public void stop() {
        this.app.stop();
    }

}
