package com.covalense.javaapp.properties;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class PersonalDetToProFile {
	public static void main(String[] args) {

		try {
			FileOutputStream fout = new FileOutputStream("demo.properties");

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
