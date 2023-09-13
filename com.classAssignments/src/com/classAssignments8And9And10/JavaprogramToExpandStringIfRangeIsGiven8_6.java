package com.classAssignments8And9And10;

public class JavaprogramToExpandStringIfRangeIsGiven8_6 {

	public static void main(String args[]) {
		
		String s1 = "1-5, 8, 11-14, 18, 20, 26-29";
		String s="a-z";
		expand(s);
	}

	public static void expand(String word) {

		
		StringBuilder sb = new StringBuilder();

		// Get all intervals
		String[] strArr = word.split(", ");

		// Traverse through every interval
		for (int i = 0; i < strArr.length; i++) {


			String[] a = strArr[i].split("-");


			if (a.length == 2) {

				int low = Integer.parseInt(a[0]);
				int high = Integer.parseInt(a[a.length - 1]);

				while (low <= high) {

					// Append all numbers
					sb.append(low + " ");
					low++;
				}
			}


			else {

				sb.append(strArr[i] + " ");
			}
		}

		System.out.println(sb.toString());
	}

}
