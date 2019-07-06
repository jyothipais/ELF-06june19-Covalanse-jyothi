package com.covalanse.javaapp.assaignments;

import java.util.logging.Logger;

public class Pro1 {
	final Logger loger = Logger.getLogger("Pro1");
	void display(Product p) {
		loger.info(p.getProductname());
		System.out.println(p.getProductno());
	}
}
