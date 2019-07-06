package com.covalense.javaapp.filehandling;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Logger;

public class Writing {
	public static void main(String[] args) {
		final Logger loger = Logger.getLogger("Writing");
		String msg = "How I Wonder What U R";
		byte b[] = msg.getBytes();
		try {
			FileOutputStream fout = new FileOutputStream("poem.txt", true);
			fout.write(b);
			fout.close();
			loger.info("data written successfully");
		} catch (IOException e) {

			e.printStackTrace();
		}
	}

}
