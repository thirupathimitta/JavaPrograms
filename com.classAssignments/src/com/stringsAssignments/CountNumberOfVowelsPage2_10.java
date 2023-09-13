package com.stringsAssignments;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountNumberOfVowelsPage2_10 {

	
		public static void main(String[] args) throws IOException {
			System.out.println("enter the String  ");
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String str = br.readLine();
			
			int sum =0;

			for(int i=0;i<str.length();i++) {
				char ch = str.toLowerCase().charAt(i);
				if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
					sum++;
					System.out.print(ch+" ");
				}
			}
			System.out.println("the number of vowels in the string  \" "+str+" \" are "+ sum);
			
		

	}

}
