package com.covalanse.javaapp.framework;

import java.util.ArrayList;

public class GenericTYpeArrayListUsingForeach {
	public static void main(String[] args) {
		ArrayList<Double> a = new ArrayList<Double>();
		a.add(22.8);
		a.add(31.9);

		for (Double d : a) {
			System.out.println(d);
		}
	}
}
