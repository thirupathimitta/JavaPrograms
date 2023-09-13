package general_practice;

import java.util.Scanner;

public class dispayDigitsOfNumber {

	public static void main(String[] args) {
		Scanner num =new Scanner(System.in);
		int x = num.nextInt();
		String s=String.valueOf(x);

//		for(int i=0;i<=s.length();i++) {
//			if(x!=0) {
//			System.out.println(x%10);
//			x= x/10;
//			}
//		}
		//another logic
		
		 for (int i = 0; i < s.length(); i++) {
	            int digit = Character.getNumericValue(s.charAt(i));
	            System.out.println(digit);
	        }
		
		
	}
}
