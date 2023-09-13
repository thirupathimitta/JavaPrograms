package com.stringsAssignments;

import java.util.Arrays;

public class RemoveGivenWordFromStringPage2_4 {

	public static void main(String[] args) {
		
		String s1=" hi   how are   you today        welcome to vtalent         ";
		String target ="today";
		String sentence ="";
		
		String[] str = s1.trim().split("\\s+");
		
		for(int i=0;i<str.length;i++) {
			if(!str[i].equals(target)) {
				sentence+=str[i]+" ";
			}
		}
		System.out.println(sentence);

	}

}
