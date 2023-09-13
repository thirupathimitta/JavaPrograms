package com.datedemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) throws ParseException {
		Date d= new Date();
		System.out.println(d);
		
		//conveting date fromat to string format --> format()
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
		String formatString = sdf.format(d);
		System.out.println(formatString);
		
		//convert string to date format 
		SimpleDateFormat sdf1 = new SimpleDateFormat("MM/dd/yyyy");
		Date parse = sdf1.parse("08/26/2023");
		System.out.println(parse);
		
	}

}
