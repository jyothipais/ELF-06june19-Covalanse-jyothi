package com.covalanse.javaapp.assaignments;

public class Bottle {
	private String b_color;
	private int b_no;
	private double b_bill;

	public Bottle(String b_color, int b_no, double b_bill) {
		this.b_no = b_no;
		this.b_bill = b_bill;
		this.b_color = b_color;
	}

	public String getB_color() {
		return b_color;
	}

	public void setB_color(String b_color) {
		this.b_color = b_color;
	}

	public int getB_no() {
		return b_no;
	}

	public void setB_no(int b_no) {
		this.b_no = b_no;
	}

	public double getB_bill() {
		return b_bill;
	}

	public void setB_bill(double b_bill) {
		this.b_bill = b_bill;
	}

}
