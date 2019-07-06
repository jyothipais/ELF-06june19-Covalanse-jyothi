package com.covalanse.javaapp.packagea;

import java.util.Scanner;
import java.util.logging.Logger;

public class Testindsample {
	final static Logger loger = Logger.getLogger("Testindsample  ");

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		loger.info("enter ur name");
		String name = s.nextLine();
		loger.info("name is" + name);
		loger.info("enter ur age");
		loger.info("name is" + name);
		s.close();
	}

}
