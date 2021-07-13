package com.qa.ims.persistence.domain;

import java.util.Objects;

public class Item {

	private Long id;
	private String itemName;
	private double price;

	public Item(String itemName, double price) {
		super();
		this.itemName = itemName;
		this.price = price;
	}

	public Item(Long id, String itemName, double price) {
		super();
		this.id = id;
		this.itemName = itemName;
		this.price = price;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "ID: " + id + " Item Name: " + itemName + " Price: £" + price;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, itemName, price);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Item other = (Item) obj;
		return Objects.equals(id, other.id) && Objects.equals(itemName, other.itemName)
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price);
	}

}
