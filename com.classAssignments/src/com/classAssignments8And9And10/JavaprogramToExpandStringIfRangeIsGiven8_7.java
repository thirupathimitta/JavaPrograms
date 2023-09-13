package com.classAssignments8And9And10;

public class JavaprogramToExpandStringIfRangeIsGiven8_7 {

	public static void main(String[] args) {
		
		        String input = "a-z";
		        String expandedString = expandString(input);
		        System.out.println("Expanded String: " + expandedString);
		    }

		    public static String expandString(String input) {
		        StringBuilder expanded = new StringBuilder();

		        for (int i = 0; i < input.length(); i++) {
		            char currentChar = input.charAt(i);

		            if (currentChar == '-') {
		                if (i > 0 && i < input.length() - 1) {
		                    char startChar = input.charAt(i - 1);
		                    char endChar = input.charAt(i + 1);
		                    expandRange(expanded, startChar, endChar);
		                }
		            } else {
		                expanded.append(currentChar);
		            }
		        }

		        return expanded.toString();
		    }

		    public static void expandRange(StringBuilder expanded, char start, char end) {
		        if (start <= end) {
		            for (char c = start; c <= end; c++) {
		                expanded.append(c);
		            }
		        } else {
		            for (char c = start; c >= end; c--) {
		                expanded.append(c);
		            }
		        }
		    }
		

}
