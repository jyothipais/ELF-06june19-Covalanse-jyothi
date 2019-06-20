package com.covalense.javaapp.basics;

public class Senior {
	public static void main(String[] args) {
		int age=65;
		double d=15.8, totalprice=200;
		if(age>=60)
		{
			totalprice=totalprice-(totalprice*d)/100;
			System.out.println("you have to pay"+totalprice);
		}
		
	}

}
