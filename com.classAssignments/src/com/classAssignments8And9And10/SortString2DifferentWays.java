package com.classAssignments8And9And10;
import java.util.Arrays;
public class SortString2DifferentWays {

	public static void main(String[] args) {
	
		        String str = "edcba";
		        
		        char[] charArray = str.toCharArray();		     
		        Arrays.sort(charArray);		        
		        String sortedStr = new String(charArray);		       
		        System.out.println("Sorted string: " + sortedStr);
//-------------------------- without sort method --------------------------------------
		        int k = 0;
			      char temp = 0;
			      char[] chars = str.toLowerCase().toCharArray();

			      for (int i = 0; i < chars.length; i++) {
			         for (k = 0; k < chars.length; k++) {
			        	 
			            if (chars[k] > chars[i]) {
			               temp = chars[i];
			               chars[i] = chars[k];
			               chars[k] = temp;
			            }
			         }
			      }
			      String sortedString1 = new String(chars);
			      System.out.println("Sorted String with out sort method: " + sortedString1);

	}

}
