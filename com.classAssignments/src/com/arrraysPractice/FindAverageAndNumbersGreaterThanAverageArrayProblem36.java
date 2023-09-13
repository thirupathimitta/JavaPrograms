package com.arrraysPractice;

public class FindAverageAndNumbersGreaterThanAverageArrayProblem36 {

	public static void main(String[] args) {
		int [] arr= {2,3,43,23,65,76,23,45,55,65,78,12,45};
		
		int sum =0;
		for(int x:arr) {
			sum+=x;
		}
		float avg =sum/arr.length;
		
		System.out.println("here is the avg:"+ avg+" and the values greater than avg:-");
		for(int x:arr) {
			if(x>avg) {
				System.out.print(x+" ");
			}
		}

	}

}
