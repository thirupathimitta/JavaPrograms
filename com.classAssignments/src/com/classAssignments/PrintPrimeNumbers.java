package com.classAssignments;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrintPrimeNumbers {
	public static void main(String[] args) throws NumberFormatException, IOException {
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br1 = new BufferedReader(isr);
		BufferedReader br2 =new BufferedReader(isr);
		int intialNumber =Integer.parseInt(br1.readLine());
		int finalNumber =Integer.parseInt(br2.readLine());
		int number = intialNumber;
		while (number <= finalNumber) {
			if (isPrime(number)) {
				System.out.println(number + " is prime");
			} else {
				System.out.println(number + " is not prime");
			}
			number++;
		}		
	}
	public static boolean isPrime(int num) {
		if(num<=1) {
			return false;
		}
		 int i = 2;
	        while (i <= num/2) {
	            if (num % i == 0) {
	                return false;
	            }
	           i++;
	        }
		return true;
	}
	}


