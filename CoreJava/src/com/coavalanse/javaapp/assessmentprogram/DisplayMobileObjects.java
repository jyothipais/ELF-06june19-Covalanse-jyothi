package com.covalense.javaapp.assessmentprogram;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class DisplayMobileObjects {
	final static  Logger loger=Logger.getLogger("DisplayMobileObjects");
public static void main(String[] args) {
		
		Mobile m1 = new Mobile("Xiaomi", 9000, "Mi A2");
		Mobile m2 = new Mobile("Motorola", 19000, "X4");
		Mobile m3 = new Mobile("Samsung", 49000, "Galaxy S9");
		Mobile m4 = new Mobile("Nokia", 12000, "6.1 Plus");
		
		List<Mobile> list = new ArrayList<>();
		
		list.add(m1);
		list.add(m2);
		list.add(m3);
		list.add(m4);
		
		printList(list);
		
		
	}
	
	static void printList(List<Mobile> list) {
		loger.info("Printing list details");
		for (Mobile m : list) {
			loger.info(m.toString());
		}
	}


}
