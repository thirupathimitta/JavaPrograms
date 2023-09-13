package com.generics;

class Box<T> {
	private T value;

	public void setValue(T value) {
		this.value = value;
	}

	public T getValue() {
		return value;
	}
}

public class GeneticsClass {

	public static void main(String[] args) {
		
		Box<Integer> intBox = new Box<>();
		Box<String> intBox1 = new Box<>();
		
		intBox.setValue(42);
		intBox1.setValue("hi");
		
		int value = intBox.getValue();
		String value1 = intBox1.getValue();
		
		System.out.println(value); 
		System.out.println(value1); 

	}

}
