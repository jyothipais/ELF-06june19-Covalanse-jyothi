package com.covalense.javaapp.filehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exp4 {
	public static void main(String[] args) {
		try {
			FileInputStream f = new FileInputStream("poem.txt");
			int i;
			while ((i = f.read()) != -1) {
				System.out.print((char) i);
			}
			f.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
