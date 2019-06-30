package com.covalanse.javaapp.studentaraylist;

public class Car implements Comparable<Car>{
	String name,brand;
	double rating;
	public int cost;
	
	
	@Override
	public int compareTo(Car o) {
		
		return this.name.compareTo(o.name);
	}
		

}
