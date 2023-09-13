package com.exceptionsHandling;

public class ExceptionExp5 {
	
	public static void main(String[] args)  {
		
		System.out.println("main method strts");
		
		ArthamaticExeption5_1 ae= new ArthamaticExeption5_1(0);
		
		method1(10,ae.a);
		System.out.println("main method end");
		
	}

	private static void method1(int i, int j)  {
		
		System.out.println("method1 starts");
		try {
			method2(i,j);
		} catch (ArthamaticExeption5_1 e) {
//			e.printStackTrace();
//			System.out.println(e.toString());
//			System.out.println(e.getMessage());
			System.out.println(e);
		
		}
		
		System.out.println("method1 end");
		
		
	}

	private static void method2(int i, int j) throws ArthamaticExeption5_1 {
		

		System.out.println("method2 starts");
		if(j>0) {
		int z=i/j;
		}
		else throw new ArthamaticExeption5_1(0);
		
		System.out.println("method2 end");
		
	}

}
