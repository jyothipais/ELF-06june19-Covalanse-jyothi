package com.covalanse.javaapp.lamdaexpression;

public class TestSum {
public static void main(String[] args) {
	Sum s=(a,b)->a+b;
	int i=s.add(3, 4);
	System.out.println("result is"+i);
}
}
