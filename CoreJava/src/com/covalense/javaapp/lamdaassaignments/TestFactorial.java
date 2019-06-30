package com.covalense.javaapp.lamdaassaignments;

import java.util.logging.Logger;

public class TestFactorial {
	public static void main(String[] args) {
		final Logger loger=Logger.getLogger("LamdaSquare");
		Factorial f=a->{
			int k=1;
			for(int i=1;i<=a;i++) {
				k=k*i;
			}
			return k;
		};
		int res=f.fact(5);
		loger.info("Factorial is: "+res);
	}
	

}
