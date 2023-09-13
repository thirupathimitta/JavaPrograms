package general_practice;

import java.util.Scanner;

public class primeOrNot {

	public static void main(String[] args) {
		Scanner number = new Scanner(System.in);
		int x = number.nextInt();
		if(isprime(x)) {
			System.out.println("prime");
		}else {
			System.out.println("not prime");
		}
	}
	public static boolean isprime(int n) {
		
		if(n<=1) {
		return false;
		}
			
		for(int i =2;i<=n/2;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
		
	}

}
