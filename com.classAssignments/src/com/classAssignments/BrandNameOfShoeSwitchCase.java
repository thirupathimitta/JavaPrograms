package com.classAssignments;

import java.io.*;

public class BrandNameOfShoeSwitchCase {

	public static void main(String[] args) throws IOException {
		/*
		 * Nike -> Just do it Adidas -> Impossible is nothing Puma -> Forever Faster
		 * Reebok -> I Am What I Am
		 */
		System.out.println("enter any of these 4 brands: nike,adidas,puma,reebok");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String brand = br.readLine().toLowerCase();
		switch (brand) {
		case "nike":
			System.out.println("Just do it");
			break;
		case "adidas":
			System.out.println("Impossible is nothing");
			break;
		case "puma":
			System.out.println("Forever Faster");
			break;
		case "reebok":
			System.out.println("I Am What I Am");
			break;
		default:
			System.out.println("enter a valid brand name");
		}

	}

}
