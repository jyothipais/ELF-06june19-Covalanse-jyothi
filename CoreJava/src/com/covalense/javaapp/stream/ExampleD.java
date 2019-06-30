package com.covalense.javaapp.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.logging.Logger;
import java.util.stream.Collectors;
public class ExampleD {
	public static void main(String[] args) {
		final  Logger loger = Logger.getLogger("ExampleD");
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(5);
		al.add(23);
		al.add(44);
		al.add(66);
		
		Predicate<Integer> x=i->3!=0;
		
		List<Integer> y=al.stream().filter(x).collect(Collectors.toList());
		loger.info(""+y);
		
		List<Integer> z=al.stream().map(i->i*2).collect(Collectors.toList());
		loger.info(""+z);
	}

}
