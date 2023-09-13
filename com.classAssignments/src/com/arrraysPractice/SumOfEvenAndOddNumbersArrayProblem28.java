package com.arrraysPractice;

public class SumOfEvenAndOddNumbersArrayProblem28 {


		public static void main(String[] args) {
			int[]arr = {1,2,3,4,5,6,7,8,9,11};
			int even =0;
			int odd=0;
			for(int i=0;i<arr.length;i++) {
				if(arr[i]%2==0) {
					even++;
				}else odd++;
			}
			

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
			System.out.println("sum of even:-");
			int sumEven=0;
			for(int x:evenArray) {
				sumEven+=x;
			}
			System.out.print(sumEven);
			
			System.out.println();
			System.out.println("odd numbers are:-");
			int sumOdd=0;
			for(int x:oddArray) {
				sumOdd+=x;
			}
			System.out.print(sumOdd);
			
		}

}


