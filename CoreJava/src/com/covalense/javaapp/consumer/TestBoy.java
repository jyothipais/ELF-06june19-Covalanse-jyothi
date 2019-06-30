package com.covalense.javaapp.consumer;

public class TestBoy {
	public static void main(String[] args) {
		MyBoy b = Boy::new;
		Boy a=b.getBoy("nitish", 5.5, 22);
		System.out.println(""+a.name);
		System.out.println(""+a.age);
		System.out.println(""+a.height);
		
	}
}
