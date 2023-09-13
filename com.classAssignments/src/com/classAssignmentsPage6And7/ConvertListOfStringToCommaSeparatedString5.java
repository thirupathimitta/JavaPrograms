package com.classAssignmentsPage6And7;
import java.util.Arrays;
import java.util.List;
public class ConvertListOfStringToCommaSeparatedString5 {

	public static void main(String[] args) {
		

		        List<String> stringList = Arrays.asList("apple", "banana", "orange", "grape");

		        String[] stringArray = stringList.toArray(new String[0]);

		        StringBuilder commaSeparatedString = new StringBuilder();
		        for (int i = 0; i < stringArray.length; i++) {
		            commaSeparatedString.append(stringArray[i]);
		            if (i < stringArray.length - 1) {
		                commaSeparatedString.append(",");
		            }
		        }

		        System.out.println(commaSeparatedString);
		


	}

}
