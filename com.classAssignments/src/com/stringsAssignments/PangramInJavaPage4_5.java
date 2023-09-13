package com.stringsAssignments;

public class PangramInJavaPage4_5 {

    public static void main(String[] args) {
        String sentence1 = "The quick brown fox jumps over the lazy dog";
      

        boolean[] letters1 = new boolean[26];
        boolean[] letters2 = new boolean[26];

        for (char c : sentence1.toCharArray()) {
            if (Character.isLetter(c)) {
                int index = Character.toLowerCase(c) - 'a';
                letters1[index] = true;
            }
        }

     

        boolean isPangram1 = true;
    

        for (boolean letter : letters1) {
            if (!letter) {
                isPangram1 = false;
                break;
            }
        }


        System.out.println(sentence1 + " is a pangram: " + isPangram1);
       
    }
}

