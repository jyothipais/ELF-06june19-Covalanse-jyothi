package com.covalanse.javaapp.lamdaexpression;

public class TestCalculateFactorial {
public static void main(String[] args) {
	 CalculateFactorial f=a->{
		int k=1;
		for(int i=1;i<=a;i++) {
			k=k*i;
		}
		return k;
	};
	int res=f.factorial(5);
	System.out.println("Factorial is"+res);
}
}
