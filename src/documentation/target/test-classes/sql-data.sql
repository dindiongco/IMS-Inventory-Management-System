INSERT INTO `customers` (`first_name`, `surname`) VALUES ('jordan', 'harrison');

INSERT INTO `items` (`item_name`, `price`) VALUES ('Plane', 9.99);

INSERT INTO `orders` (`customer_id`) VALUES (1);

INSERT INTO `orders_items` (`order_id`, `item_id`, `quantity`) VALUES (1, 1, 10);
