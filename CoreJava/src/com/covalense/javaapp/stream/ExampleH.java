package com.covalense.javaapp.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.logging.Logger;

public class ExampleH {
	public static void main(String[] args) {
		final Logger loger = Logger.getLogger("ExampleH");
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(5);
		al.add(23);
		al.add(84);
		al.add(66);
	
		
		Comparator<Integer> c=(i,j)->i.compareTo(j);
		Integer minValue=al.stream().min(c).get();
		loger.info(""+minValue);
	}

}
