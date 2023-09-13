package com.arrraysPractice;

import java.util.Arrays;

public class MinLengthOfWordAndIndexArrays {

	public static void main(String[] args) {
		// assignment-5--min length of word and print index
		String[] arr = {"coffee","water","chai","diet cok"};
	Arrays.sort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	

		String word=arr[0];
		int index = 0;
		for (int i=1;i<arr.length;i++) {
			if(word.length()>arr[i].length()) {
				word= arr[i];
				index =i;
			}
		}
		System.out.println("ans = "+word +" and index ="+index);

	}

}
