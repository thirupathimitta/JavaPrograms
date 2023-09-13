package com.methodsOnStrings;

public class permutationsIteration {
	

	    public static void main(String[] args) {
	        String str = "abc";
	        generatePermutations(str);
	    }

	    public static void generatePermutations(String str) {
	        int n = str.length();
	        char[] chars = str.toCharArray();
	        int[] indexes = new int[n];
	        int i = 0;

	        while (i < n) {
	            if (indexes[i] < i) {
	                swap(chars, i % 2 == 0 ? 0 : indexes[i], i);
	                printPermutation(chars);
	                indexes[i]++;
	                i = 0;
	            } else {
	                indexes[i] = 0;
	                i++;
	            }
	        }
	    }

	    public static void swap(char[] chars, int i, int j) {
	        char temp = chars[i];
	        chars[i] = chars[j];
	        chars[j] = temp;
	    }

	    public static void printPermutation(char[] chars) {
	        for (char ch : chars) {
	            System.out.print(ch + " ");
	        }
	        System.out.println();
	    }
	}


