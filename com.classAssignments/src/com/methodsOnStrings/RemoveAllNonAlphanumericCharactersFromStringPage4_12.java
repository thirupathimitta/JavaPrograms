package com.methodsOnStrings;

public class RemoveAllNonAlphanumericCharactersFromStringPage4_12 {
		public static void main(String[] args) {
			
	        String inputString = "Hello!@#123World";
	        
	        RemoveAllNonAlphanumericCharactersFromStringPage4_12.method1(inputString);
	       
	        



}
		private static void method1( String inputString) {
			 StringBuilder Builder = new StringBuilder();
		        
		        for (int i = 0; i < inputString.length(); i++) {
		            char c = inputString.charAt(i);
		            
		            if (Character.isLetterOrDigit(c)) {
		                Builder.append(c);
		            }
		        }
		
		        System.out.println(Builder.toString());
		}

}
