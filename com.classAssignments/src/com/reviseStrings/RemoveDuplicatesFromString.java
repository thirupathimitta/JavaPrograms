package com.reviseStrings;

public class RemoveDuplicatesFromString {

	public static void main(String[] args) {
		
	String str="thirupathi";
	char[] arr = str.toCharArray();
     char[] arr1 = new char [arr.length];
     int newIndex = 0;
     
     for (int i = 0; i < arr.length; i++) {
         boolean isDuplicate = false;
         
         for (int j = 0; j < newIndex; j++) {
             if (arr[i]==(arr1[j])) {
                 isDuplicate = true;
                 break;
             }
         }
         if (!isDuplicate) {
             arr1[newIndex] = arr[i];
             newIndex++;
         }
     }
     for (int i = 0; i < newIndex; i++) {
         System.out.print(arr[i]+" ");
     }
	
	}

}

