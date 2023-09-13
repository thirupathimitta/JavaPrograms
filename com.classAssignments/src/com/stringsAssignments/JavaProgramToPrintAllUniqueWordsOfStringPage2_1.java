package com.stringsAssignments;

import java.util.Arrays;

public class JavaProgramToPrintAllUniqueWordsOfStringPage2_1 {
	public static void main(String[] args)
	{
		String str = "Welcome to geeks for this geeks for ";

			int count;

			String[] words = str.split("\\W"); 

			for (int i = 0; i < words.length; i++) {
				count=0;

				for (int j = i + 1; j < words.length; j++) {
					if (words[i].equalsIgnoreCase(words[j])) {

						count++;

						words[j] = "";
					}
				}
				if (count == 0 && words[i] != "")
					System.out.print(words[i]+" ");
			}
		
		}
	
}
