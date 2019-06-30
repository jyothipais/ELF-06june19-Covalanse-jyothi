package com.covalense.javaapp.filehandling;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Register {
	private static final Logger loger = Logger.getLogger("Register");

	void connectDB() {
		loger.log(Level.SEVERE, "HI im SEVERE MESSEGE");
		loger.info("connected to DB");

	}

	void store() {
		loger.log(Level.SEVERE, "HI im SEVERE MESSEGE");
		loger.info("connected to DB");
	}

}
