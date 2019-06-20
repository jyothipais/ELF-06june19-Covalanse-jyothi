package com.covalense.javaapp.filehandling;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class Loggeexample {
	private static final Logger loger = Logger.getLogger("eyekiller");

	public static void main(String[] args) {

		LogManager.getLogManager().reset();
		loger.setLevel(Level.ALL);

		ConsoleHandler ch = new ConsoleHandler();
		ch.setLevel(Level.CONFIG);
		loger.addHandler(ch);

		loger.log(Level.SEVERE, "HI im SEVERE MESSEGE");
		loger.log(Level.WARNING, "HI im WARNING MESSEGE");
		loger.log(Level.INFO, "HI im INFO MESSEGE");
		loger.log(Level.CONFIG, "HI im CONFIG MESSEGE");
		loger.log(Level.FINE, "HI im FINE MESSEGE");
		loger.log(Level.FINER, "HI im FINER MESSEGE");
		loger.log(Level.FINEST, "HI im FINEST MESSEGE");

	}

}
