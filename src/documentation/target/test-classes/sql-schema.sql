drop schema if exists imstest;

CREATE SCHEMA IF NOT EXISTS `imstest`;

USE `imstest` ;

CREATE TABLE IF NOT EXISTS `customers` (
    `customer_id` INT(11) NOT NULL AUTO_INCREMENT,
    `first_name` VARCHAR(40) DEFAULT NULL,
    `surname` VARCHAR(40) DEFAULT NULL,
    PRIMARY KEY (`customer_id`)
);

CREATE TABLE IF NOT EXISTS `items` (
    `item_id` INT NOT NULL AUTO_INCREMENT,
    `item_name` VARCHAR(40) DEFAULT NULL,
    `price` DECIMAL(10,2) DEFAULT NULL,
    PRIMARY KEY (`item_id`)
);

CREATE TABLE IF NOT EXISTS `orders` (
    `order_id` INT NOT NULL AUTO_INCREMENT,
	`customer_id` INT NOT NULL,
    PRIMARY KEY (`order_id`),
    FOREIGN KEY (`customer_id`) REFERENCES customers(`customer_id`)
);

CREATE TABLE IF NOT EXISTS `orders_items` (
	`orders_items_id` INT NOT NULL AUTO_INCREMENT,
	`order_id` INT NOT NULL,
    `item_id` INT NOT NULL,
    `quantity` INT NOT NULL,
    PRIMARY KEY (`orders_items_id`),
    FOREIGN KEY (`order_id`) REFERENCES orders(`order_id`),
    FOREIGN KEY (`item_id`) REFERENCES items(`item_id`)
    );  