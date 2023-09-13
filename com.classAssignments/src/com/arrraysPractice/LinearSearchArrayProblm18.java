package com.arrraysPractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LinearSearchArrayProblm18 {

		    public static void main(String[] args) throws NumberFormatException, IOException {
		        int[] arr= {5, 10, 15, 20, 25, 30,-1};
		        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				System.out.println("enter the target element");
				int target= Integer.parseInt(br.readLine());

		        int index = -1;

		        for (int i = 0; i < arr.length; i++) {
		            if (arr[i] == target) {
		              index=i;
		            }
		    }
		        if(index==-1) {
		        	System.out.println("no element is there in array");
		        }else
		        System.out.println("the ndex value is "+  index);
		    }
	}

		

		