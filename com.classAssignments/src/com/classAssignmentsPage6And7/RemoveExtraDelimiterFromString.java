package com.classAssignmentsPage6And7;

public class RemoveExtraDelimiterFromString {

	
	    public static void main(String[] args) {
	        String input = "apple,,banana,,,orange,,,,grape,,,,,,, ,, , , ,, , ,,,,  ,, ";
	        String delimiter = ",";

	        String[] parts = input.split(delimiter);
	        
	        StringBuilder resultBuilder = new StringBuilder();

	        for (String part : parts) {
	            if (!part.trim().isEmpty()) {
	                resultBuilder.append(part.trim());
	                resultBuilder.append(delimiter);
	            }
	        }

	        String result = resultBuilder.toString();
	        
	        if (result.endsWith(delimiter)) {
	            result = result.substring(0, result.length() -1);
	        }
	      

	        System.out.println(result);
	    
	}



}
