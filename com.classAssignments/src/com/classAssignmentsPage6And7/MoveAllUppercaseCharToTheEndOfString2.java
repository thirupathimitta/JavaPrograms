package com.classAssignmentsPage6And7;

public class MoveAllUppercaseCharToTheEndOfString2 {

	public static void main(String[] args) {
		String input = "  Hello heLLGFg";
        
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
