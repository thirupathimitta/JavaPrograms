package com.methodsOnStrings;

public class SwapFirstAndLastCharacterOfStringPage4_6 {
	public static void main(String[] args) {

		
        String str = "Hello, World!";
        //using substring 
        String f= str.substring(0,1);
        String l= str.substring(str.length()-1,str.length());
        String str1=l+str+f;
        System.out.println(str1);
        //using tocharArray method
        String result = swapFirstLastCharacter(str);
        
        System.out.println("Original string: " + str);
        System.out.println("String after swapping first and last character: " + result);
    }

    public static String swapFirstLastCharacter(String str) {
        if (str == null || str.length() < 2) {
            return str; // No need to swap if the string is null or has less than 2 characters
        }

        char[] charArray = str.toCharArray();
        char firstChar = charArray[0];
        
        char lastChar = charArray[charArray.length - 1];
        
        charArray[0] = lastChar;
        charArray[charArray.length - 1] = firstChar;

        return new String(charArray);
    }
}
