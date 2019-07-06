package com.covalense.javaapp.basics;

import java.util.logging.Logger;

public class Senior {
	final static Logger loger = Logger.getLogger("Senior");
	public static void main(String[] args) {
		int age=65;
		double d=15.8;
		double totalprice=200;
		if(age>=60)
		{
			totalprice=totalprice-(totalprice*d)/100;
			loger.info("you have to pay"+totalprice);
		}
		
	}

}
