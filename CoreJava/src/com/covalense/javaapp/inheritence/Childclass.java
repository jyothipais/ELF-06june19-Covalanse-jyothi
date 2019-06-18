package com.covalense.javaapp.inheritence;

public class Childclass extends Singleinheritence {
	void child() {
		System.out.println("Imk a child class content");
	}

	public static void main(String[] args) {
		Childclass c = new Childclass();
		c.child();
		c.parent();
	}
}
