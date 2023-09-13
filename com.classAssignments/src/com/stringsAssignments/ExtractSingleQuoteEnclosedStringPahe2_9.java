package com.stringsAssignments;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractSingleQuoteEnclosedStringPahe2_9 {

	public static void main(String[] args) {
			
		        String input = "This is a 'sample' string with 'single quoted' substrings.";
		      

		        // Create a Pattern object with the regex pattern
		        Pattern p = Pattern.compile("'(.*?)'");
		        System.out.println(p);

		        // Create a Matcher object for the input string
		        Matcher matcher = p.matcher(input);
		        System.out.println(matcher);

		        // Find and print all occurrences of single quote enclosed strings
		        while (matcher.find()) {
		            String extractedString = matcher.group(1);
		            System.out.println(extractedString);
		
		        }
	}
}
