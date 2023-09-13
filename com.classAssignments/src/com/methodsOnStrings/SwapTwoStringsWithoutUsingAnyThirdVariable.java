package com.methodsOnStrings;

public class SwapTwoStringsWithoutUsingAnyThirdVariable {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";
        
        System.out.println("Before swapping:");
        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);
        SwapTwoStringsWithoutUsingAnyThirdVariable obj = new  SwapTwoStringsWithoutUsingAnyThirdVariable();        
        obj.swapStrings(str1,str2);
        System.out.println("\nAfter swapping:");
        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);
    }
    
    public  void swapStrings(String str1, String str2) {
        str1 = str1 + str2;
        str2 = str1.substring(0, str1.length() - str2.length());
        str1 = str1.substring(str2.length());
        
      
        System.out.println("Swapped String 1: " + str1);
        System.out.println("Swapped String 2: " + str2);
        
    }
}

