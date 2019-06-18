package com.covalense.javaapp.filehandling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Writing {
	public static void main(String[] args) {
		String msg = "How I Wonder What U R";
		byte b[] = msg.getBytes();
		try {
			FileOutputStream fout = new FileOutputStream("poem.txt", true);
			fout.write(b);
			fout.close();
			System.out.println("data written successfully");
		} catch (IOException e) {

			e.printStackTrace();
		}
	}

}
