package com.covalense.javaapp.filehandling;

import java.io.File;
import java.io.IOException;
import java.util.logging.Logger;

public class File1 {
	public static void main(String[] args) {
		final Logger loger = Logger.getLogger("File1");

		File f = new File("smily.txt");
		try {
			boolean res = f.createNewFile();
			loger.info("result is" + res);
			loger.info("done");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
