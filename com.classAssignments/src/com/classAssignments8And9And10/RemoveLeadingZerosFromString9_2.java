package com.classAssignments8And9And10;

public class RemoveLeadingZerosFromString9_2 {

	public static void main(String[] args) {
		String str = "00000000012003569000000000000000";

		int i = 0;
		while (str.charAt(i) == '0') {

			i++;
		}
		String result = str.substring(i);
		System.out.println("------------");
		System.out.println("Original string: " + str);
		System.out.println("String without leading zeros: " + result);
		
		int k = 0;
		
		String result2 = "";
		while (result.charAt(k) != 0) {
			result2 += result.charAt(k);
		}
		System.out.println("------------");
		System.out.println("String without leading zeros: " + result2);

	}

}
