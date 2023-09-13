package com.methodsOnStrings;

public class Demo {
	
	Aa method1(Bb x) {
	
		return new Aa();
	}

	public static void main(String[] args) {
		
		 Demo d = new Demo();
		
		 Bb b= new Bb();
		
		 Aa a =d.method1(b);
		 System.out.println(a.id);
		 
	}

}
