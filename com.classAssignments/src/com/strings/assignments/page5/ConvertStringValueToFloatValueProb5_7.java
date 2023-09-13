package com.strings.assignments.page5;

public class ConvertStringValueToFloatValueProb5_7 {

	public static void main(String[] args) {
		String stringValue = "3.14";

		float floatValue1 = Float.parseFloat(stringValue);
		//another way valueof
		float floatValue = Float.valueOf(stringValue);
		System.out.println("String value: " + stringValue);
		System.out.println("Float value: " + floatValue);
	}

}
