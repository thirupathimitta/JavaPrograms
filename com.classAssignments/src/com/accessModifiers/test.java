package com.accessModifiers;

class UBIBank {

	void Loan() {
		System.out.println(" Ubi providing Personal Loan");
	}
	void govtScheme() {
		System.out.println(" Ubi providing atalPensionYojanaScheme");

	}
}

 class Customer extends UBIBank  {

	 @Override
	 void govtScheme() {
			System.out.println(" Customer requires atalPensionYojanaScheme");
	 }
}
class Employee extends UBIBank {
	 @Override
	void Loan() {
		System.out.println(" Employee requires Personal Loan");
	}
	
}
public class test {
public static void main(String[] args) {
	
	Customer c= new Customer();
	c.govtScheme();
	
	Employee e = new Employee();
	e.Loan();
}
}
