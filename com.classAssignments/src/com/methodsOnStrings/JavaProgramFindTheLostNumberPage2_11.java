package com.methodsOnStrings;

public class JavaProgramFindTheLostNumberPage2_11 {

	
    public static int findLostNumber(int[] nums) {
        int n = nums.length + 1;
        int expectedSum = (n * (n + 1)) / 2; 

        int actualSum = 0;
        for (int num : nums) {
            actualSum += num; 
        }

        return expectedSum - actualSum; 
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 6, 7, 8, 9, 10}; 
        int lostNumber = findLostNumber(nums);
        System.out.println("Lost number: " + lostNumber);
    }

}
