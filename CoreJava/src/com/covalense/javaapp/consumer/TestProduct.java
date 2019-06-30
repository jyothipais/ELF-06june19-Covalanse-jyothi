package com.covalense.javaapp.consumer;

import lombok.extern.java.Log;

@Log
public class TestProduct {
	public static void main(String[] args) {

		MyProduct m = Product::new;
		Product p = m.getProduct(30, "book");

		System.out.println("price is" + p.price);
		System.out.println("name is" + p.name);
	}
}
