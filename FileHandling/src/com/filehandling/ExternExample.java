package com.filehandling;

import java.io.*;

public class ExternExample {
	
	public static void main(String[] args)
	{
		Car car = new Car("Shubham", 1995);
		Car newcar = null;

		// Serialize the car
		try {
			FileOutputStream fo
				= new FileOutputStream("file.txt");
			ObjectOutput so
				= new ObjectOutputStream(fo);
			so.writeObject(car);
			so.flush();
		}
		catch (Exception e) {
			System.out.println(e);
		}

		// Deserialization the car
		try {
			FileInputStream fi
				= new FileInputStream("file.txt");
			ObjectInputStream si
				= new ObjectInputStream(fi);
			newcar = (Car)si.readObject();
		}
		catch (Exception e) {
			System.out.println(e);
		}
		

		System.out.println("The original car is:\n" + car);
		System.out.println("The new car is:\n" + newcar);
	}
}

