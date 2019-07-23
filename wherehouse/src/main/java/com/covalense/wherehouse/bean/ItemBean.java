package com.covalense.wherehouse.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="Items")
public class ItemBean implements Serializable {
	@Id
	@Column(name = "Item_Id")
	private int item_Id;
	@Column(name = "Item_Name")
	private String name;
	@Column(name = "Quantity")
	private int quantity;
	@Column(name = "Cost")
	private double cost;
	@Column(name = "Description")
	private String description;
}
