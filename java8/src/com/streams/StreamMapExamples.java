package com.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

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

}

public class StreamMapExamples {

	public static void main(String[] args) {
		List<Product> products = Arrays.asList(new Product("Apple", 1.0), new Product("Banana", 0.5),
				new Product("Orange", 0.75));

	
		List<String> productNames = products.stream().map(Product::getName).collect(Collectors.toList());

		System.out.println(productNames); 
	}
}
