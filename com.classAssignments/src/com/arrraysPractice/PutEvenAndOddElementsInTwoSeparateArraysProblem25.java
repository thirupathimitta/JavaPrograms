package com.arrraysPractice;

import java.util.Arrays;

public class PutEvenAndOddElementsInTwoSeparateArraysProblem25 {

	public static void main(String[] args) {
		int[]arr = {1,2,3,4,5,6,7,8,9,11};
		int even =0;
		int odd=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				even++;
			}else odd++;
		}
		
		System.out.println(even+ " "+odd);
		int [] evenArray =new int[even];
		int [] oddArray =new int[odd];
		
		for(int i=0,j=0,k=0;i<arr.length;i++) {
			
			if(arr[i]%2==0) {
				evenArray[j]=arr[i];
				j++;
			}	else {
				oddArray[k]=arr[i];
				k++;
			}
		}
		System.out.print(Arrays.toString(evenArray));
		System.out.print(Arrays.toString(oddArray));
	}

}
