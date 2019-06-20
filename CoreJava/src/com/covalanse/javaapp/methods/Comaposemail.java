package com.covalanse.javaapp.methods;

public class Comaposemail {
	public static void main(String[] args) {
		Mail m = new Mail();
		m.cc = "Resume";
		m.from = "jyothi";
		m.to = "bala";
		System.out.println("from" + m.from);
	}

}

class Mail {
	String to, from, cc;

	void send() {
		System.out.println("Mail send");
	}

	void attachment() {
		System.out.println("Fail attach");
	}
}
