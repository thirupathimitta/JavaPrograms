package com.methodsOnStrings;

public class SwappingPairsOfCharactersInStringPage4_2 {
	public static void main(String args[]) {

		String str = "GeeksForGeeks";
		

		System.out.println(SwappingPairsOfCharactersInStringPage4_2.swapPair(str));
	}

	public static String swapPair(String str) {

		if (str == null || str.isEmpty())
			return str;

		char[] ch = str.toCharArray();

		for (int i = 0; i < ch.length - 1; i += 2) {

			char temp = ch[i];
			ch[i] = ch[i + 1];
			ch[i + 1] = temp;
		}

		return new String(ch);
	}

}
