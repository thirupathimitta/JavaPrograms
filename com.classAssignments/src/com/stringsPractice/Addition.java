package com.stringsPractice;


public class Addition {
	
	int empSalary = 20000;
	int empIncentives = 5000;
	int shiftAllowances = 4000;
	int T = (empSalary + empIncentives + shiftAllowances);

	public static void main(String[] args) {

		Addition add1 = new Addition();
		// add1.Add();
			add1.Addition();
	
	}

	

	public void Addition() {
		System.out.println("Total salary of employee is " + T);
		
	}

}
