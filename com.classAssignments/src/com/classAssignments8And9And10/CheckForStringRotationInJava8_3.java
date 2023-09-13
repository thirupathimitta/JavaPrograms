package com.classAssignments8And9And10;

public class CheckForStringRotationInJava8_3 {

	public static void main(String[] args) {
	
		        String str1 = "hello";
		        String str2 = "lohel";
		        
		        
		        boolean isRotation = isRotation(str1, str2);
		        
		        if (isRotation) {
		            System.out.println("The second string is a rotation of the first string.");
		        } else {
		            System.out.println("The second string is not a rotation of the first string.");
		        }
		    }
		    
		    public static boolean isRotation(String str1, String str2) {
		        if (str1.length() != str2.length()) {
		            return false;
		        }
		        
		        
		        String concatenated = str1 + str1;//hellohello
		        
		        return concatenated.contains(str2);
		 


	}

}
