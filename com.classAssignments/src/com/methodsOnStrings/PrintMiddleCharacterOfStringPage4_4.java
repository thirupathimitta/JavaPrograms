package com.methodsOnStrings;

public class PrintMiddleCharacterOfStringPage4_4 {
	
	public static void main(String[] args) {
		
	
			String str="thirupathi";

			PrintMiddleCharacterOfStringPage4_4 ob = new PrintMiddleCharacterOfStringPage4_4();
			ob.method1(str);

}
	private void method1(String str) {
	   int length = str.length();
       
       int middleIndex =length/2;
        
        if (length % 2 == 0) {
            // For even-length strings, return the character at middleIndex - 1
            System.out.print(str.charAt(middleIndex - 1));
            System.out.println(str.charAt(middleIndex));
        } else {
            // For odd-length strings, return the character at middleIndex
        		System.out.println(str.charAt(middleIndex));
        		
        }
	}
}
