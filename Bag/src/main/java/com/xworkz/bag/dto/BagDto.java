package com.xworkz.bag.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "bag")

public class BagDto {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int id;
	@Column(name = "name")
	private String name;
	@Column(name = "color")
	private String color;
	@Column(name = "price")
	private String price;
	@Column(name = "compartments")
	private int compartments;

	public BagDto() {

		System.out.println("dto is created");

	}

	public BagDto(String name, String color, String price, int compartments) {
		this.name = name;
		this.color = color;
		this.price = price;
		this.compartments = compartments;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public int getCompartments() {
		return compartments;
	}

	public void setCompartments(int compartments) {
		this.compartments = compartments;
	}

	@Override
	public String toString() {
		return "BagDto [id=" + id + ", name=" + name + ", color=" + color + ", price=" + price + ", compartments="
				+ compartments + "]";
	}

}
