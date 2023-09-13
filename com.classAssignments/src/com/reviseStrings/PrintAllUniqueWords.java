package com.reviseStrings;

public class PrintAllUniqueWords {

	
	    public static void main(String[] args) {
	        String str = "Hello world hello Java world java come to java";
	        
	        // Split the input string into words using whitespace as the delimiter
	        String[] words = str.split("\\s+");
	     
	        for(int i=0;i<words.length;i++) {
	        	
	        boolean isDuplicate= true;
	        for(int j=0;j<i;j++) {
	        	if(words[i].equalsIgnoreCase(words[j])) {
	        		isDuplicate=false;
	        		break;
	        	}
	        }
	        if(isDuplicate) {
	        	System.out.println(words[i]);
	        }
	        	}
	        }
	


}
