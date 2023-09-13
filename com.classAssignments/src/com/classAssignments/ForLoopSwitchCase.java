package com.classAssignments;

public class ForLoopSwitchCase {

	public static void main(String[] args) {

		for (int i = 1; i <= 7; i++) {
			switch (i) {
			case 1:
				System.out.println(i + " sunday");
				break;
			case 2:
				System.out.println(i + " monday");
				break;
			case 3:
				System.out.println(i + " tuesday");
				break;
			case 4:
				System.out.println(i + " wednesday");
				break;
			case 5:
				System.out.println(i + " thursday");
				break;
			case 6:
				System.out.println(i + " friday");
				break;
			case 7:
				System.out.println(i + " saturday");
				break;
			default:
				System.out.println("not valid");
			}

		}

		/*
		 * int x = 0; if (x > 0) { System.out.println("+ve number"); } else if (x < 0) {
		 * System.out.println("ive number"); } else { System.out.println("zero"); }
		 */
	}

}
