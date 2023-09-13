package general_practice;

import java.util.Scanner;

public class findingFactors {

	//assignments
	public static void main(String[] args) {
		//finding factors of given number and sum of faactors
		Scanner number = new Scanner(System.in);
		int x = number.nextInt();
		 int sum=0;
		 System.out.print("factors are :-");
		for(int i =1 ;i<=x;i++) {
			if(x%i==0) {
				int a=i;
				sum +=a;
				System.out.print(i+",");//
			}
		}
		System.out.print(" and sum of factors :-");
		System.out.println(sum);//24
		

	}

}
