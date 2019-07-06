package com.covalense.javaapp.lamdaassaignments;

import java.util.logging.Logger;

public class TestLamdaMessage {
	public static void main(String[] args) {
		final Logger loger=Logger.getLogger("LamdaSquare");
		LamdaMessage l=()->{
			return "hello this is Lamda Message";
		};
		loger.info(l.msg());
	}

}
