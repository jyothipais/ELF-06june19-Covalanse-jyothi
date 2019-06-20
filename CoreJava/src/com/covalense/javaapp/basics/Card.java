package com.covalense.javaapp.basics;

public class Card {
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
		System.out.println("count of java is "+j.cnt);
		System.out.println("count of angularjs is"+a.cnt);
		System.out.println("count of php is"+p.cnt);
		System.out.println("the organization count is"+Card.organizationcnt);

	}
}
