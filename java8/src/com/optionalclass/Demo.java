package com.optionalclass;

import java.util.Optional;

public class Demo {
	public static void main(String[] args) {
		Customer c= new Customer(101,"thiru","testgamil");
		
//		String email = c.getEmail();
//		System.out.println(email);
		/*
		 * Optional<String> emailOptional= Optional.of(c.getEmail());
		 * System.out.println(emailOptional);
		 */ 
		
		/*
		 * Optional<String> ofNullable = Optional.ofNullable(c.getEmail());
		 * 
		 * System.out.println(ofNullable);
		 */
	
		
//		Optional<String> emailOptional3 = Optional.ofNullable(c.getEmail());
		/*
		 * if(emailOptional3.isPresent()) { System.out.println(emailOptional3.get());
		 * }else System.out.println("no email data found");
		 */
//		System.out.println(emailOptional3.orElse("no email dad found"));
		
//		System.out.println(emailOptional3.orElseGet(()->"no data found"));
				
		
//		System.out.println(emailOptional3.orElseThrow(() -> new IllegalArgumentException("email data not found")));

//		System.out.println(emailOptional3.map(String::hashCode).orElseGet(()-> "where is your emil id fill frst"));
		
		
		
		
	}

	
}
