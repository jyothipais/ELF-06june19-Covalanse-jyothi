package com.covalense.javaapp.filehandling;

import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Logger;

public class Exp3 {
	public static void main(String[] args) {
		final Logger loger = Logger.getLogger("Exp3");
		String msg = "How I Wonder What U R";
		char c[] = msg.toCharArray();

		try {
			FileWriter fw = new FileWriter("password.txt");

			fw.write(c);
			fw.flush();
			loger.info("data written successfully");
		} catch (IOException e) {

			e.printStackTrace();
		}
	}

}
