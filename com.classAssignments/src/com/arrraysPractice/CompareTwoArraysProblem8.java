package com.arrraysPractice;

public class CompareTwoArraysProblem8 {
	/*If two arrays are having the same reference or same length 
	 * and they contain similar elements 
	 * then both arrays are equal else they are not equal.
	 */
	public static void main(String[] args) {
		
		int [] arr1= {1,2,3,4,5};
		int[] arr2 = arr1;
		int[] arr3 = {1,2,3,4,6};
		int[] arr4 = {1,2,3,4,5};
		if(arr1==arr2) {
			System.out.println("equal");
		}else {System.out.println("not equal");}
		

		System.out.println("-------------another way------------");
		
		
		
		 boolean areEqual1 = compareArrays(arr1,arr2);
	        boolean areEqual2 = compareArrays(arr1,arr3);
	        boolean areEqual3 =compareArrays(arr1,arr4);
	        System.out.println("Array1 and Array2 are equal: " + areEqual1);
	        System.out.println("Array1 and Array3 are equal: " + areEqual2);
	        System.out.println("Array1 and Array4 are equal: " + areEqual3);
	}
	 static boolean compareArrays(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            return false;
        }

        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }

        return true;
    }

}
