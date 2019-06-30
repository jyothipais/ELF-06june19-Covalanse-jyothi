package com.covalense.javaapp.implementinglamda;

public class TestExample {
	public static void main(String[] args) {
		Example m1=new Example();
		Thread t=new Thread(m1);
		t.start();
	}

}
