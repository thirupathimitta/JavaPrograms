package com.collectorsStream;

import java.util.*;
import java.util.stream.Collectors;

public class CollectorsRealWorldExamples {
	public static void main(String[] args) {
		List<Product> products = Arrays.asList(new Product("Phone", 699.99), new Product("Laptop", 1299.99),
				new Product("Tablet", 399.99), new Product("Headphones", 149.99), new Product("Monitor", 349.99));

		// Grouping Products by Price Range
		Map<String, List<Product>> productsByPriceRange = products.stream().collect(Collectors.groupingBy(product -> {
			if (product.getPrice() < 500) {
				return "Low";
			} else if (product.getPrice() < 1000) {
				return "Medium";
			} else {
				return "High";
			}
		}));
		System.out.println("Products by Price Range: " + productsByPriceRange);

		// Calculating Total Price of Products
		double totalPrice = products.stream().mapToDouble(Product::getPrice).sum();
		System.out.println("Total Price of Products: " + totalPrice);

		// Partitioning Expensive and Inexpensive Products
//		Map<Boolean, List<Product>> expensiveAndInexpensive = products.stream()
//				.collect(Collectors.partitioningBy(product -> product.getPrice() >= 500));
//		System.out.println("Expensive and Inexpensive Products: " + expensiveAndInexpensive);

		// Joining Product Names into a Comma-Separated String
		String productNames = products.stream().map(Product::getName).collect(Collectors.joining(", "));
		System.out.println("Product Names: " + productNames);
	}
}

//**********************************************************************************
class Product {
	private String name;
	private double price;

	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + "]";
	}
	
}