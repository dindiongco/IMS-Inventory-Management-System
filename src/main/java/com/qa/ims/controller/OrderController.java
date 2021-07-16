package com.qa.ims.controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.qa.ims.persistence.dao.OrderDAO;
import com.qa.ims.persistence.domain.Order;
import com.qa.ims.utils.Utils;

public class OrderController implements CrudController<Order> {
	
	public static final Logger LOGGER = LogManager.getLogger();
	
	private OrderDAO orderDAO;
	private Utils utils;

	public OrderController(OrderDAO orderDAO, Utils utils) {
		super();
		this.orderDAO = orderDAO;
		this.utils = utils;
	}

	@Override
	public List<Order> readAll() {
		List<Order> orders = orderDAO.readAll();
		for (Order order : orders) {
			LOGGER.info(order);
		}
		return orders;
	}

	@Override
	public Order create() {
		LOGGER.info("Please enter a Customer ID: ");
		Long customerId = utils.getLong();
		Order order = orderDAO.create(new Order(customerId));
		LOGGER.info("Order created!");
		return order;
	}
	
	public Order addItem() {
		LOGGER.info("Please enter an Order ID: ");
		Long orderId = utils.getLong();
		LOGGER.info("Please enter the Item ID: ");
		Long itemId = utils.getLong();
		LOGGER.info("Please enter the quantity of the item you would like to add: ");
		int quantity = utils.getInt();
		Order order = orderDAO.addItem(new Order(orderId, itemId, quantity));
		LOGGER.info("Item added!");
		return order;
	}

	@Override
	public Order update() {
		LOGGER.info("Please enter the ID of the Order you would like to update: ");
		Long id = utils.getLong();
		LOGGER.info("Please enter the Item ID: ");
		Long itemId = utils.getLong();
		LOGGER.info("Please enter the quantity: ");
		int quantity = utils.getInt();
		Order order = orderDAO.update(new Order(id, itemId, quantity));
		LOGGER.info("Item Updated!");
		return order;
	}

	@Override
	public int delete() {
		LOGGER.info("Please enter the ID of the ORDER you would like to delete: ");
		Long id = utils.getLong();
		LOGGER.info("Order deleted!");
		return orderDAO.delete(id);
	}
	
	public int deleteItem() {
		LOGGER.info("Please enter the ID of the ITEM you would like to delete: ");
		Long id = utils.getLong();
		LOGGER.info("Order deleted!");
		return orderDAO.deleteItem(id);
	}
	
	public Double calculateCost() {
		LOGGER.info("Please enter the Order ID: ");
		Long orderId = utils.getLong();
		Double total = orderDAO.calculateCost(orderId);
		LOGGER.info("Your Total is: £" + total);
		
		return total;
	}

}
