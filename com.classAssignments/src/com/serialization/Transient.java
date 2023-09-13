package com.serialization;




import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Transient implements Serializable {


	private static final long serialVersionUID = -100l;

	int id;
	String name;
	String email;
	transient String pwd;

	public static void main(String[] args) throws Exception {

		Transient p = new Transient();
		p.id = 100;
		p.name = "Raju";
		p.email= "raju@gmail.com";
		p.pwd = "raj@123";

		System.out.println("====Serialization Started ========");

		FileOutputStream fos = new FileOutputStream("person.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(p);
		oos.flush();
		oos.close();
		System.out.println("====Serialization completed========");

		System.out.println("==========De-Serialization Started==========");

		FileInputStream fis = new FileInputStream("person.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Object object = ois.readObject();
		Transient p1 = (Transient) object;
		System.out.println("Id : " + p1.id);
		System.out.println("Name : " + p1.name);
		System.out.println("Email : " + p1.email);
		System.out.println("Pwd : " + p1.pwd);
		ois.close();

		System.out.println("==========De-Serialization Ended==========");

	}

}
