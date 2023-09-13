package com.methodsOnStrings;

public class ConvertSnakeCaseStringToCamelCasePage4_8 {

	public static void main(String[] args) {

		String str = "geeks_for_geeks";
		
		ConvertSnakeCaseStringToCamelCasePage4_8 ob= new ConvertSnakeCaseStringToCamelCasePage4_8();
		str = ob.snakeToCamel(str);
	
		System.out.println(str);
	}

	private String snakeToCamel(String str) {
		// Capitalize first letter of string
		str = str.substring(0, 1).toUpperCase() + str.substring(1);

		// Convert to StringBuilder
		StringBuilder builder = new StringBuilder(str);

		for (int i = 0; i < builder.length(); i++) {

			// Check char is underscore
			if (builder.charAt(i) == '_') {

				builder.deleteCharAt(i);
				System.out.println( builder.charAt(i));
				builder.replace(i, i + 1, String.valueOf(Character.toUpperCase(builder.charAt(i))));
			}
		}

		// Return in String type
		return builder.toString();
	}

}
