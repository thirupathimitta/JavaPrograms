package com.stringsAssignments;

public class JavaProgramMoveAllUppercaseCharactersToEndPage2_5 {

	public static void main(String[] args) {
		
		
		        String input = "heLLGFg";
		        
		        String lowercase = "";
		        String uppercase = "";

		        for (int i = 0; i < input.length(); i++) {
		            char ch = input.charAt(i);

		            if (Character.isUpperCase(ch)) {
		                uppercase += ch;
		            } else {
		                lowercase += ch;
		            }
		        }

		       String s2=lowercase + uppercase;
		       System.out.println(s2);

	}

}
