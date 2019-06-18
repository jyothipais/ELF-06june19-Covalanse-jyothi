package com.covalense.javaapp.filehandling;

import java.io.File;

public class File2 {
	public static void main(String[] args) {
		File f = new File("movies/kannada/new");
		boolean res = f.mkdirs();
		System.out.println("result is" + res);
	}

}
