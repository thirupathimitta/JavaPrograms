package general_practice;

import java.util.Scanner;

public class perfectnumbers1and1000 {

	public static void main(String[] args) {
		
		
		for(int i =5 ;i<=10000;i++) {
			int sum=0;
			for(int j =1;j<=i/2;j++) {
				if(i%j==0) {	
					sum+=j;
				}			
			}
			if(sum==i) {
				System.out.println(i);
			}
		}

	}

}
