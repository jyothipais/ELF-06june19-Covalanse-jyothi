package com.covalanse.javaapp.framework;

import java.util.ArrayList;

public class Test5 {
	public static void main(String[] args) {
		ArrayList<Double> a = new ArrayList<Double>();
		a.add(9.2);
		a.add(1.5);
		a.add(6.9);
		a.add(2.4);
		a.add(3.6);
		
		System.out.println("******BEFORE********"+a);
		
		boolean r=a.remove(2.4);
		System.out.println("Removed object is :"+r);

		
		System.out.println("******AFTER********"+a);
	}

}
