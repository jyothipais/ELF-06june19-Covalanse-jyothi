package com.covalanse.javaapp.lamdaexpression;

import java.util.logging.Logger;

public class TestCalculateFactorial {
	final static Logger loger = Logger.getLogger("TestCalculateFactorial");
public static void main(String[] args) {
	 CalculateFactorial f=a->{
		int k=1;
		for(int i=1;i<=a;i++) {
			k=k*i;
		}
		return k;
	};
	int res=f.factorial(5);
	loger.info("Factorial is"+res);
}
}
