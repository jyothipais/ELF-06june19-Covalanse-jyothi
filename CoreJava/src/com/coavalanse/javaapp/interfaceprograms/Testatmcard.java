package com.covalense.javaapp.interfaceprograms;

public class Testatmcard {
	public static void main(String[] args) {
		ICICI i = new ICICI();
		Machine m = new Machine();
		HDFC h = new HDFC();
		SBI s = new SBI();
		m.slot(s);
	}

}