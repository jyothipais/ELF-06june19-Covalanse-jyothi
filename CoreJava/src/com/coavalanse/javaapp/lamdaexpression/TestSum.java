package com.covalanse.javaapp.lamdaexpression;

import java.util.logging.Logger;

public class TestSum {
	final static Logger loger = Logger.getLogger("TestSum");
public static void main(String[] args) {
	Sum s=(a,b)->a+b;
	int i=s.add(3, 4);
	loger.info("result is"+i);
}
}
