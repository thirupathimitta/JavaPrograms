package com.stringsAssignments;

public class SwapFirstAndLastCharacterOfStringPage4_6 {

    public static void main(String[] args) {
        String str = "Hello, World!";
        
        // Using substring
        String f = str.substring(0, 1);
        String l = str.substring(str.length() - 1, str.length());
        String str1 = l + str + f;
        System.out.println(str1);
        
        // Using toCharArray method
        char[] charArray = str.toCharArray();
        char firstChar = charArray[0];
        char lastChar = charArray[charArray.length - 1];
        charArray[0] = lastChar;
        charArray[charArray.length - 1] = firstChar;
        String result = new String(charArray);
        
        System.out.println("Original string: " + str);
        System.out.println("String after swapping first and last character: " + result);
    }
}
