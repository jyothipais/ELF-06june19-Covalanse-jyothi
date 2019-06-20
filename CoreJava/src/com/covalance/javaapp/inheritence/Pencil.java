package com.covalance.javaapp.inheritence;

public abstract class Pencil {
	void draw() {
		System.out.println("drawing from pencil in pencil class");
	}

	abstract void write();

	abstract void color();
}
