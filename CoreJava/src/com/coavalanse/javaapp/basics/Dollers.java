package com.covalense.javaapp.basics;

import java.util.logging.Logger;

public class Dollers {
	final static Logger loger = Logger.getLogger("Dollers");
	public static void main(String[] args) {
		double rupees = 1000;
		double E = 78.58, D = 69.55;
		loger.info("doller is" + rupees / D);
		loger.info("euro is" + rupees / E);
	}

}
