package com.stringsPractice;

public class AddingCharacterAsThousandsSeparatorToGivenNumberPage3_5 {

	public static void main(String[] args) {
	
		        int number = 1234567899;

		        String str= String.valueOf(number);
		        
		        StringBuilder formattedNumber = new StringBuilder();
		        String result = "";

		        int length = str.length();
		        int separatorIndex = length % 3 == 0 ? 3 : length % 3;

		        for (int i = 0; i < length; i++) {
		            char digit = str.charAt(i);
		            formattedNumber.append(digit);
		            result+=digit;
		            

		            if (i + 1 == separatorIndex && i + 1 < length) {
		                formattedNumber.append(",");
		                result+=",";
		                separatorIndex += 3;
		            }
		        }

		        System.out.println(formattedNumber.toString());  // Output: 123,456,789
		        System.out.println(result);
		  


	}

}
