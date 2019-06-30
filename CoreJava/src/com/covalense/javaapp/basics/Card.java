package com.covalense.javaapp.basics;

import java.util.logging.Logger;

public class Card {
	final static Logger loger = Logger.getLogger("Card");
	static int organizationcnt;
	int cnt;
	void cardswipe()
	{
		organizationcnt++;
		cnt++;
	}
	public static void main(String[] args) {
		Card j=new Card();
		Card p=new Card();
		Card a=new Card();
		loger.info("count of java is "+j.cnt);
		loger.info("count of angularjs is"+a.cnt);
		loger.info("count of php is"+p.cnt);
		loger.info("the organization count is"+Card.organizationcnt);

	}
}
