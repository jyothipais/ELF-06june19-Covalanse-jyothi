package com.covalanse.javaapp.been;

public class Markersinglet {
	private static final Markersinglet m = new Markersinglet();

	private Markersinglet() {

	}

	public static Markersinglet getMarkersinglet() {
		return m;
	}

}
