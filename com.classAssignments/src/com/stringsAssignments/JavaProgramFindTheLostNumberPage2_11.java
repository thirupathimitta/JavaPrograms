package com.stringsAssignments;



	public class JavaProgramFindTheLostNumberPage2_11 {

	    public static void main(String[] args) {
	        int[] nums = {1, 2, 3, 4, 6, 7, 8, 9, 10};
	        int n = nums.length + 1;
	        int expectedSum = (n * (n + 1)) / 2;

	        int actualSum = 0;
	        for (int num : nums) {
	            actualSum += num;
	        }

	        int lostNumber = expectedSum - actualSum;
	        System.out.println("Lost number: " + lostNumber);
	    }
	}

		


	


