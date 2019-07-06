package com.covalanse.javaapp.lamdaexpression;

import java.util.logging.Logger;

public class TestSquareOfGivenNo {
	final static Logger loger = Logger.getLogger("TestSquareOfGivenNo");
public static void main(String[] args) {
	SquareOfGivenNo s=b->{
		int a = 0;
		return a=a*a;
	};
	int res=s.square(5);
	loger.info("Factorial is"+res);
}
}
