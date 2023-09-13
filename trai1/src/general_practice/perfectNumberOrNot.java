package general_practice;

import java.util.Scanner;

public class perfectNumberOrNot {
	 //sum of factors except itself is equal to same number is perfect number
	public static void main(String[] args) {
		Scanner number = new Scanner(System.in);
		int x = number.nextInt();
		 int sum=0;
		 System.out.print("factors are :-");
		for(int i =1 ;i<x;i++) {
			if(x%i==0) {
				int a=i;
				sum +=a;
				System.out.print(i+",");//
			}
		}
		if(sum==x) {
			System.out.println(" "+x+ " is a perfect number" );
		}else {
			System.out.println(x +" is not perfect number");
		}
		

	}

	}


