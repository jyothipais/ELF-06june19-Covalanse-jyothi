package com.covalense.javaapp.basics;

import java.util.logging.Logger;

public class Odd {
	final static Logger loger = Logger.getLogger("Odd");
	public static void main(String[] args) {
		double n=23;
		if(n%2==0)
		{
		loger.info("number is even"+n);
		}
		else
		{
			loger.info("number is odd"+n);
		}
	}

}
