package com.covalanse.javaapp.studentaraylist;

import java.util.ArrayList;
import java.util.logging.Logger;

public class TestProduct {
	public static void main(String[] args) {
		final Logger loger = Logger.getLogger("TestProduct");
		ArrayList<Product> a = new ArrayList<Product>();

		Product a1 = new Product();
		a1.name = "book";
		a1.cost = 25;
		a1.rating = 3.5;

		Product a2 = new Product();
		a2.name = "pencil";
		a2.cost = 10;
		a2.rating = 2.9;

		Product a3 = new Product();
		a3.name = "pen";
		a3.cost = 05;
		a3.rating = 4.0;

		Product a4 = new Product();
		a4.name = "bottle";
		a4.cost = 15;
		a4.rating = 3.5;

		a.add(a1);
		a.add(a2);
		a.add(a3);
		a.add(a4);
		for (int i = 0; i < a.size(); i++) {
			Product s = a.get(i);
			loger.info("name is :" + s.name);
			loger.info("id is :" + s.cost);
			loger.info("percentage is :" + s.rating);

		}

	}

}
