package com.covalense.javaapp.stream;

import java.util.stream.Stream;

public class ExampleK {
	public static void main(String[] args) {

		// Integer[] a= {5,6,8,2,1};
		Stream<Integer> s = Stream.of(22, 61, 21, 55);
		// s.forEach(i->log.info(""+i));
		s.forEach(System.out::println);
	}

}
