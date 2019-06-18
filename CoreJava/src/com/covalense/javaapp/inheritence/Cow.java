package com.covalense.javaapp.inheritence;

public class Cow extends Lion {
	void eatt() {
		System.out.println("Cow is eating grass");
	}

	public static void main(String[] args) {
		Cow c = new Cow();
		c.eatt();
		c.eat();
		c.eating();
	}
}
