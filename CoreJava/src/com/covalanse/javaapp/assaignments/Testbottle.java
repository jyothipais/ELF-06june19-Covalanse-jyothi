package com.covalanse.javaapp.assaignments;

import java.util.logging.Logger;

public class Testbottle {
	final static Logger loger = Logger.getLogger("Testbottle");
	public static void main(String[] args) {
		Bottle b = new Bottle("pink", 20, 31);

		b.getB_no();
		b.getB_bill();
		b.getB_color();

		loger.info("Bottle color is :" + b.getB_color());
		loger.info("Bottle no is :" + b.getB_no());
		loger.info("Bottle cost  is :" + b.getB_bill());

	}
}
