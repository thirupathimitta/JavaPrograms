package com.stringsAssignments;

import java.util.Arrays;

public class SwapCornerWordsAndReverseMiddleCharactersOfStringPage2_3 {

    public static void main(String[] args) {
        String sentence = "Hello world, how are you?";

        String[] words = sentence.split(" ");

        if (words.length >= 2) {
            String temp = words[0];
            words[0] = words[words.length - 1];
            words[words.length - 1] = temp;
        }
        System.out.println(Arrays.toString(words));

        for (int i = 1; i < words.length - 1; i++) {
            words[i] = reverseString(words[i]);
        }

        String swappedAndReversed = String.join(" ", words);
        System.out.println(swappedAndReversed);
    }

    public static String reverseString(String word) {
        char[] characters = word.toCharArray();
        int length = characters.length;

        for (int i = 0; i < length / 2; i++) {
            char temp = characters[i];
            characters[i] = characters[length - i - 1];
            characters[length - i - 1] = temp;
        }

        return new String(characters);
    }
}

