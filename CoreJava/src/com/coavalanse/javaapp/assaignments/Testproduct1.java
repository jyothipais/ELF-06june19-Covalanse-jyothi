package com.covalanse.javaapp.assaignments;

import java.util.logging.Logger;

public class Testproduct1 {
	final static Logger loger = Logger.getLogger("Testproduct1");
	public static void main(String[] args) {

		Product1 p = new Product1("pencil", 20, 10);
	
		p.getP_no();
		p.getP_bill();
		p.getP_name();

		loger.info("Product name is :" + p.getP_name());
		loger.info("Product age is :" + p.getP_no());
		loger.info("Product height  is :" + p.getP_bill());

		

	}
}
