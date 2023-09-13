package com.classAssignmentsPage6And7;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
public class ConvertStringToDate {

	public static void main(String[] args) throws ParseException {
	

		
		        String dateString = "2022-03-15";
		        String formatPattern = "dd-mm-yyyy";

		        
		        SimpleDateFormat dateFormat = new SimpleDateFormat(formatPattern);
		        dateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));

		       
		            Date date = dateFormat.parse(dateString);
		            System.out.println("Parsed Date: " + date);
		       
		        
		
	}

}
