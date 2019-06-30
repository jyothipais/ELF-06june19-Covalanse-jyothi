package com.covalense.javaapp.filehandling;

import java.io.File;
import java.util.logging.Logger;

public class File2 {
	public static void main(String[] args) {
		final Logger loger = Logger.getLogger("File2");
		File f = new File("movies/kannada/new");
		boolean res = f.mkdirs();
		loger.info("result is" + res);
	}

}
