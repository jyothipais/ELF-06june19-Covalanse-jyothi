package com.covalanse.javaapp.assaignments;

import java.util.logging.Logger;

public class Pro2 {
	final static Logger loger = Logger.getLogger("Pro2");
	void display(Product p) {
		loger.info(p.getProductname());
		loger.info(""+p.getProductno());
	}
}
