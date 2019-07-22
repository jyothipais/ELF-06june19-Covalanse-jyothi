package com.covalense.hibernateapp.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Entity
@Data
@Table(name="products")
public class ProductBean {
	@Id
	@Column(name="productid")
	private int productid;
	@Column(name="productname")
	private String productname;
	@Column(name="price")
	private double price;
	@Column(name="color")
	private String color;
	@Column(name="weight")
	private double weight;

}
