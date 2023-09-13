package com.exceptionsHandling;

public class ArthamaticExeption5_1 extends Exception {
	int a;

	@Override
	public String toString() {
		return "ArthamaticExeption5_1 [a=" + " is null value or zero"+ "]";
	}

	public ArthamaticExeption5_1(int a) {
	
		this.a = a;
	}

}
