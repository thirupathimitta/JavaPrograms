package com.classAssignments8And9And10;
import java.util.regex.*;
public class ProgramCheckValidMobileNumber8_9 {

	public static void main(String[] args) {

		        String phoneNumber = "9876543210";

		        if (isValidMobileNumber(phoneNumber)) {
		            System.out.println("Valid mobile number");
		        } else {
		            System.out.println("Invalid mobile number");
		        }
		    }

		    public static boolean isValidMobileNumber(String phoneNumber) {
		       
		        if (phoneNumber == null || phoneNumber.isEmpty()) {
		            return false;
		        }

		      
		        if (phoneNumber.length() != 10) {
		            return false;
		        }

		      
		        for (char digit : phoneNumber.toCharArray()) {
		            if (!Character.isDigit(digit)) {
		                return false;
		            }
		        }

		       
		        char firstDigit = phoneNumber.charAt(0);
		        if (firstDigit != '7' && firstDigit != '8' && firstDigit != '9') {
		            return false;
		        }

		  
		        return true;
		    }
		
}
