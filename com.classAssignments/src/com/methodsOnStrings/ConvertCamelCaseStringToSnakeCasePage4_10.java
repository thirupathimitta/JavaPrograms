package com.methodsOnStrings;


public class ConvertCamelCaseStringToSnakeCasePage4_10 {

	public static void main(String args[]) {
		
		String str = "GeeksForGeeks";
		ConvertCamelCaseStringToSnakeCasePage4_10 ob =new ConvertCamelCaseStringToSnakeCasePage4_10();

		System.out.print(ob.camelToSnake(str));
	}

	private String camelToSnake(String str) {

		String result = "";

		
		char c = str.charAt(0);
		
		result = result + Character.toLowerCase(c);

	
		for (int i = 1; i < str.length(); i++) {

			char ch = str.charAt(i);

			if (Character.isUpperCase(ch)) {
				result = result + '_';
				result = result + Character.toLowerCase(ch);
			}

			
			else {
				result = result + ch;
			}
		}

	
		return result;
	}


}
