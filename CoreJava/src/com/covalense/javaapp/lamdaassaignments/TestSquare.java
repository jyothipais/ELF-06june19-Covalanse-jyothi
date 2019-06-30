package com.covalense.javaapp.lamdaassaignments;

import java.util.logging.Logger;

public class TestSquare {
	public static void main(String[] args) {
		final Logger loger=Logger.getLogger("LamdaSquare");
		Square s=a->{
			int sq;
			sq=a*a;
			return a;
		};
		double res=s.square(6);
		loger.info("square is:"+res);
	}

}
