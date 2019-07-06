package com.covalense.javaapp.filehandling;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Amezon {
	private final static Logger loger = Logger.getLogger("Amezon");

	public static void main(String[] args) {
		LogManager.getLogManager().reset();
		loger.setLevel(Level.ALL);

		try {

			FileHandler fh = new FileHandler("Amezonlog", true);
			fh.setLevel(Level.SEVERE);

			loger.addHandler(fh);

			Register r = new Register();
			r.connectDB();
			r.store();
		} catch (SecurityException s) {
			s.printStackTrace();

		} catch (IOException e) {
			e.printStackTrace();

		}
	}

}
