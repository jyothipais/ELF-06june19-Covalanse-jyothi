package com.covalense.javaapp.stream;

import java.io.FileOutputStream;
import java.io.IOException;

public class ExampleC {
	public static void main(String[] args) {
		String msg = "*** hi ***";
		byte b[] = msg.getBytes();
		try (FileOutputStream fout = new FileOutputStream("star.txt", true);) {
			fout.write(b);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
