package com.google_tasks;

public class answer1 {

	public static void main(String[] args) {

//		rectangle r= new rectangle(2,3);
//		r.area();
//		r.perimeter();
//		square s= new square(5);
//		s.area();
//		s.perimeter();
		
		square[] s1 = new square[5];
		int k=5;
		for(int i=0;i<s1.length;i++) {
			s1[i]= new square(k);
			System.out.println("area");
			s1[i].area();
			k++;
		}

	}

}
