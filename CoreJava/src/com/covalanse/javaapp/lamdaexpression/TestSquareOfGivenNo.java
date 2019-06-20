package com.covalanse.javaapp.lamdaexpression;

public class TestSquareOfGivenNo {
public static void main(String[] args) {
	SquareOfGivenNo s=b->{
		int a = 0;
		return a=a*a;
	};
	int res=s.square(5);
	System.out.println("Factorial is"+res);
}
}
