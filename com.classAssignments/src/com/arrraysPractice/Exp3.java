package com.arrraysPractice;

public class Exp3 {

	public static void main(String[] args) {
		
		  int[] arr = {1, 2, 3, 4, 2, 5, 3, 6, 1, 7, 8, 9, 8,1,7};
		  
		int temp=0;

		  for(int i=0;i<arr.length;i++) {
			  int count=0;
			  
			  for(int j=0;j<arr.length;j++) {
				  
				  if(arr[i]==arr[j]) {
					  count++;
				  }
				
			  }
			  if(count==1) {
				  temp++;	  
			  }   
		  }
		  int[] arr2 = new int [temp];
		 
		 
		  System.out.println(temp);
		  
		  
	}
	
}
