package com.arrraysPractice;

public class GCDOfNumberArraysProblem17 {

	public static void main(String[] args) {
		int[] arr= {12, 24, 36, 48,60,45,0,45,9,27};
        int gcd = arr[0];

        for (int i = 1; i < arr.length; i++) {
        	
            gcd = method(gcd, arr[i]);
        }

        System.out.println("GCD of the array: " + gcd);
    }

    public static int method(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b; 
            a = temp;
        }
        return a;
    }

}








	


