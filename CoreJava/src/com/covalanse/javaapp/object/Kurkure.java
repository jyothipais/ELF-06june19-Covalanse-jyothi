package com.covalanse.javaapp.object;

public class Kurkure extends Baby {
	void open() {
		System.out.println("open the Kurkure");
	}

	public static void main(String[] args) {
		Kurkure k = new Kurkure();
		k.open();
		Lays a = new Lays();
		a.open();

	}
}
