package com.covalanse.javaapp.assaignments;

public class Product1 {
	private String p_name;
	private int p_no;
	private double p_bill;

	public  Product1(String p_name, int p_no, double p_bill) {
		this.p_no = p_no;
		this.p_bill = p_bill;
		this.p_name = p_name;
	}

	public String getP_name() {
		return p_name;
	}

	public void setP_name(String p_name) {
		this.p_name = p_name;
	}

	public int getP_no() {
		return p_no;
	}

	public void setP_no(int p_no) {
		this.p_no = p_no;
	}

	public double getP_bill() {
		return p_bill;
	}

	public void setP_bill(double p_bill) {
		this.p_bill = p_bill;
	}

}
