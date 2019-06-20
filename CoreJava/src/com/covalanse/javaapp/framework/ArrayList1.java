package com.covalanse.javaapp.framework;

import java.util.ArrayList;

public class ArrayList1 {
 public static void main(String[] args) {
	ArrayList a=new ArrayList();
	a.add(12);
	a.add("eyekiller");
	a.add(22.5);
	a.add("B");
	
	
	
	for(int i =0;i<a.size();i++) {
		Object r=a.get(i);
		System.out.println(r);
	}
	
}
}
