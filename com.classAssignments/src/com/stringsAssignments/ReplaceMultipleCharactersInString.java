package com.stringsAssignments;

public class ReplaceMultipleCharactersInString {

	public static void main(String[] args) {

			String str ="welcome to vtalent";
			//replace
		System.out.println(str.replace('o', 'A'));
		//replaceAll
		 String replacedText = str.replaceAll("[aeiou]", "*");
		 System.out.println(replacedText);
		 //replaceFirst
		 System.out.println(str.replaceFirst("welcome", "come"));
	}

}
