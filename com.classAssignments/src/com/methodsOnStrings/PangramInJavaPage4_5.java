package com.methodsOnStrings;

public class PangramInJavaPage4_5 {

	public static void main(String[] args) {
	
		        String sentence1 = "The quick brown fox jumps over the lazy dog";
		        String sentence2 = "Pack my box with five dozen liquor jugs";
		        
		        
		        System.out.println(sentence1 + " is a pangram: " + isPangram(sentence1));
		        System.out.println(sentence2 + " is a pangram: " + isPangram(sentence2));
		    }

		    public static boolean isPangram(String sentence) {
		    	
		        boolean[] letters = new boolean[26];

		        for (char c : sentence.toCharArray()) {
		            if (Character.isLetter(c)) {
		                int index = Character.toLowerCase(c) - 'a';
		                letters[index] = true;
		            }
		        }

		        for (boolean letter : letters) {
		            if (!letter) {
		                return false;
		            }
		        }

		        return true;

		    }
}
