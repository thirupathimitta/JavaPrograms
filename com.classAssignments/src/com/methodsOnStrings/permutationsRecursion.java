package com.methodsOnStrings;

public class permutationsRecursion {
	

	public static void main(String[] args) {
		String str="abc";
		permutationsRecursion  obj =new permutationsRecursion ();
		obj.printPerm(str," ");
	}
	
	private void printPerm(String str, String permutation) {
		if(str.length()==0) {
			System.out.println(permutation);
			return;
		}

		for(int i=0;i<str.length();i++) {
			 
			char ch= str.charAt(i);
			
			String newString = str.substring(0,i) +str.substring(i+1);
		
			printPerm(newString,permutation+ch);
		}
	
	}

}
