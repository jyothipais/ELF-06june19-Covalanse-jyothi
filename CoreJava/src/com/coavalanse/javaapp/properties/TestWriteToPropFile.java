package com.covalense.javaapp.properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Logger;

public class TestWriteToPropFile {
	public static void main(String[] args) {
		final Logger loger = Logger.getLogger("WriteToPropFile");
		try {
			FileInputStream fin = new FileInputStream("Demo.properties");
			Properties p = new Properties();
			p.load(fin);
			String phoneNo = p.getProperty("phoneNo");
			String CompanyName = p.getProperty("CompanyName");

			loger.info("" + phoneNo);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
