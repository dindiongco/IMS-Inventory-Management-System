package com.qa.ims.persistence.domain;

import java.util.Objects;

public class Order {

	private Long id;
	private Long customerId;
	private Long itemId;
	private int quantity;
	
	public Order(Long customerId) {
		super();
		this.customerId = customerId;
	}

	public Order(Long id, Long customerId) {
		super();
		this.id = id;
		this.customerId = customerId;
	}
	
	public Order(Long id, Long itemId, int quantity) {
		super();
		this.id = id;
		this.itemId = itemId;
		this.quantity = quantity;
	}
	
	public Order(Long id, Long customerId, Long itemId, int quantity) {
		super();
		this.id = id;
		this.customerId = customerId;
		this.itemId = itemId;
		this.quantity = quantity;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public Long getItemId() {
		return itemId;
	}

	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public int hashCode() {
		return Objects.hash(customerId, id, itemId, quantity);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Order other = (Order) obj;
		return Objects.equals(customerId, other.customerId) && Objects.equals(id, other.id)
				&& Objects.equals(itemId, other.itemId) && quantity == other.quantity;
	}

	@Override
	public String toString() {
		return "Order ID: " + id + " Customer ID: " + customerId + " Item ID: " + itemId + " Quantity: " + quantity;
	}

}
