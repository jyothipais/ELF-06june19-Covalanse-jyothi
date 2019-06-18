package com.covalense.javaapp.filehandling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class Exp3 {
	public static void main(String[] args) {
		String msg = "How I Wonder What U R";
		char c[] = msg.toCharArray();

		try {
			FileWriter fw = new FileWriter("password.txt");

			fw.write(c);
			fw.flush();
			System.out.println("data written successfully");
		} catch (IOException e) {

			e.printStackTrace();
		}
	}

}
