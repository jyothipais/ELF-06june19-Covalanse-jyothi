package com.covalense.javaapp.inheritence;

public class Marker extends Pen {
	void color() {
		System.out.println("Marker color is BLACK");
	}

	public static void main(String[] args) {
		Marker q = new Marker();
		q.color();
		q.write();

		Pen p = new Pen();
		p.write();

		Pen r = new Marker();
		r.write();
		// r.color();

	}
}
