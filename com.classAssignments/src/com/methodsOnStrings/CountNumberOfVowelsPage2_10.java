package com.methodsOnStrings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountNumberOfVowelsPage2_10 {

    public static void main(String[] args) throws IOException {
        System.out.println("Enter the string: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        
        int vowelCount = countVowels(str);
        
        System.out.println("The number of vowels in the string \"" + str + "\" is " + vowelCount);
    }

    public static int countVowels(String str) {
        int vowelCount = 0;
        
        for (int i = 0; i < str.length(); i++) {
            char ch = Character.toLowerCase(str.charAt(i));
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;
                System.out.print(ch + " ");
            }
        }
        
        return vowelCount;
    }
}

