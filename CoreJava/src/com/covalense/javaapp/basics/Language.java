package com.covalense.javaapp.basics;

import java.util.logging.Logger;

public class Language {
	final static Logger loger = Logger.getLogger("Language");
	public static void main(String[] args) {
		int selectedlanguage = 6;
		switch (selectedlanguage) {
		case 1:
			loger.info("Selected Language is KANNADA");
			break;
		case 2:
			loger.info("Selected Language is ENGLISH");
			break;
		case 3:
			loger.info("Selected Language isHINDI");
			break;
		case 4:
			loger.info("Selected Language isTAMIL");
			break;
		case 5:
			loger.info("Selected Language isTELUGU");
			break;
		default:
			loger.info("invalid option you have selected!!!!!!!!!!!!");
		}
	}

}
