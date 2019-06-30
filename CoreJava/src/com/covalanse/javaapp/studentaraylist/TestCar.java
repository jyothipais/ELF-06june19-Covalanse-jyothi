package com.covalanse.javaapp.studentaraylist;

import java.util.TreeSet;
import java.util.logging.Logger;

public class TestCar {
	final static Logger loger = Logger.getLogger("TestCar");

	public static void main(String[] args) {
		TreeSet<Car> a = new TreeSet<Car>();

		Car a1 = new Car();
		a1.name = "benz";
		a1.brand = "xyz";
		a1.cost = 250000;
		a1.rating = 3.5;

		Car a2 = new Car();
		a2.name = "Baleno";
		a2.brand = "mno";
		a2.cost = 100000;
		a2.rating = 2.9;

		Car a3 = new Car();
		a3.name = "maruthi";
		a3.brand = "def";
		a3.cost = 450000;
		a3.rating = 4.0;

		Car a4 = new Car();
		a4.name = "swift";
		a4.brand = "abc";
		a4.cost = 50000;
		a4.rating = 2.5;

		a.add(a1);
		a.add(a2);
		a.add(a3);
		a.add(a4);

		for (Car c : a) {
			loger.info(c.name);
			loger.info(c.brand);
			loger.info("" + c.cost);
			loger.info("" + c.rating);
			loger.info("******************************");
		}
	}

}
