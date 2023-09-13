package com.classAssignments;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SwitchCaseSeasons {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
		int n =Integer.parseInt(br1.readLine());
		switch(n) {
		case 12:
        case 1:
        case 2:
        	System.out.println("Winter");
            break;
        case 3:
        case 4:
        case 5:
        	System.out.println("spring");
            break;
        case 6:
        case 7:
        case 8:
        	System.out.println("summer");
            break;
        case 9:
        case 10:
        case 11:
        	System.out.println("autumn");
            break;
        default:
        	System.out.println("enter valid month number");
            break;
    }
		}
	}


