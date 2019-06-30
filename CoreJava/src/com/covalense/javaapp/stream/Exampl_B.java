package com.covalense.javaapp.stream;

import java.util.logging.Logger;

public class Exampl_B {
	final static Logger loger = Logger.getLogger("WriteToPropFile");

	public static void main(String[] args) {

		String s = "apple";

		switch (s) {
		case "apple":
			loger.info("this is apple");
			break;
		case "mango":
			loger.info("this is mango");
			break;
		case "orange":
			loger.info("this is orange");
			break;
		}
	}
}
