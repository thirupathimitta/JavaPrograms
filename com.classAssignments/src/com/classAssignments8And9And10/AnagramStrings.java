package com.classAssignments8And9And10;

import java.util.Arrays;

public class AnagramStrings {

	/*
	 * public static void main(String[] args) { String str1 = "listen"; String str2
	 * = "silent";
	 * 
	 * boolean isAnagram = checkAnagram(str1, str2);
	 * 
	 * if (isAnagram) { System.out.println(str1 + " and " + str2 +
	 * " are anagrams."); } else { System.out.println(str1 + " and " + str2 +
	 * " are not anagrams."); } }
	 * 
	 * public static boolean checkAnagram(String str1, String str2) {
	 * 
	 * str1 = str1.toLowerCase(); str2 = str2.toLowerCase();
	 * 
	 * // Remove whitespace characters from the strings str1 =
	 * str1.replaceAll("\\s", ""); str2 = str2.replaceAll("\\s", "");
	 * 
	 * // If the lengths of the strings are not equal, they cannot be anagrams if
	 * (str1.length() != str2.length()) { return false; }
	 * 
	 * // Convert the strings to character arrays and sort them char[] charArray1 =
	 * str1.toCharArray(); char[] charArray2 = str2.toCharArray();
	 * Arrays.sort(charArray1); Arrays.sort(charArray2);
	 * 
	 * // Compare the sorted character arrays return Arrays.equals(charArray1,
	 * charArray2); }
	 */
	public static void main(String[] args) {
		String str = "silent";
		String str1 = "Listen";
		int k = 0;
		char temp = 0;
		char[] chars = str1.toLowerCase().toCharArray();

		for (int i = 0; i < chars.length; i++) {
			for (k = 0; k < chars.length; k++) {

				if (chars[k] > chars[i]) {
					temp = chars[i];
					chars[i] = chars[k];
					chars[k] = temp;
				}
			}
		}

		if (str.equals(str1)) {
			System.out.println("panagram");
		}
		String sortedString1 = new String(chars);
		System.out.println("Sorted String with out sort method: " + sortedString1);

	}
}
