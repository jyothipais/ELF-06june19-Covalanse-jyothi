package com.covalense.javaapp.lamdaassaignments;

import java.util.logging.Logger;

public class TestSum {
	public static void main(String[] args) {
		final Logger loger=Logger.getLogger("LamdaSquare");
		Sum s=(a,b)->a+b;
		int i=s.add(3, 7);
		loger.info("result is:"+i);
	}

}
