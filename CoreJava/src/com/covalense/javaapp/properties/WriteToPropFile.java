package com.covalense.javaapp.properties;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Logger;

public class WriteToPropFile {
	public static void main(String[] args) {
		final Logger loger = Logger.getLogger("WriteToPropFile");
		try {
			FileOutputStream fout = new FileOutputStream("demo.properties");
			Properties p = new Properties();
			p.setProperty("CompanyName", "Covalense");
			p.setProperty("phoneNo", "0123456789");

			try {
				p.store(fout, "Details");
				loger.info("Created the File");
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
