package com.covalense.javaapp.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.logging.Logger;
public class ExampleG {
	public static void main(String[] args) {
		final Logger loger = Logger.getLogger("ExampleD");
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(5);
		al.add(23);
		al.add(84);
		al.add(66);
	
		al.stream().forEach(i->loger.info(""+i));
	}

}
