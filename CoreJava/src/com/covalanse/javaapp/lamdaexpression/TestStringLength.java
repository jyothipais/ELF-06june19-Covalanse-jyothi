package com.covalanse.javaapp.lamdaexpression;

import java.util.logging.Logger;

public class TestStringLength {
	final static  Logger loger = Logger.getLogger("TestStringLength");
	public static void main(String[] args) {
		StringLength s=a->a.length();
		int i=s.get("smily");
		loger.info(""+i);
	}

}
