package com.covalense.javaapp.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import lombok.extern.java.Log;

@Log
public class ExampleF {
	public static void main(String[] args) {
		final Logger loger = Logger.getLogger("ExampleD");
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(5);
		al.add(23);
		al.add(84);
		al.add(66);
	
		Stream<Integer> s=	al.stream().sorted();
		Comparator<Integer> c=(i,j)->i.compareTo(j)*-1;
		List<Integer> b1=s.collect(Collectors.toList());
		loger.info("" + b1);
		
		
	}
}
