package com.covalense.javaapp.filehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Logger;

public class Exp4 {
	public static void main(String[] args) {
		final Logger loger = Logger.getLogger("Exp4");
		try {
			FileInputStream f = new FileInputStream("poem.txt");
			int i;
			while ((i = f.read()) != -1) {
				loger.info("" + (char) i);
			}
			f.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
