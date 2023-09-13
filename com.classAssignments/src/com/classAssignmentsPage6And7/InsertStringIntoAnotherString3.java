package com.classAssignmentsPage6And7;

public class InsertStringIntoAnotherString3 {

	public static void main(String[] args) {

		String originalString = "Hello, world!";
		String stringToInsert = "beautiful ";

		int insertionIndex = 7;

		String result = originalString.substring(0, insertionIndex) + stringToInsert
				+ originalString.substring(insertionIndex);

		System.out.println(result);

		// --------------------
		// using string BUilder- insert()method

		int insertionIndex1 = 7;

		StringBuilder stringBuilder = new StringBuilder(originalString);
		stringBuilder.insert(insertionIndex, stringToInsert);

		String result1 = stringBuilder.toString();
		System.out.println(result);

	}

}
