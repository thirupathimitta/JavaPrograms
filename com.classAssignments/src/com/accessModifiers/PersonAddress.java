package com.accessModifiers;

class Address{
	
	String houseNumber;
	String street;
	String location;
	 Address(String houseNumber,String street,String location) {
	this.location=location;
	this.houseNumber=houseNumber;
	this.street=street;
	}
}

public class PersonAddress {

	Address add = new Address("1-14","kphb","hyd"); 
	Address add1 = new Address("1-75","jntu","hyd"); 
	
	int empId=101;
	String name ="thiru";

	public static void main(String[] args) {
		
		PersonAddress per =new PersonAddress();
		System.out.println(per.name+"("+per.empId+")"+"temporary address"+", houseNuber: "+per.add.houseNumber+", street: "+per.add.street+", location "+per.add.location);
		
		System.out.println(per.name+"("+per.empId+")"+"permanent address"+", houseNuber: "+per.add1.houseNumber+", street: "+per.add1.street+", location "+per.add1.location);
	}

}

