package com.stringsAssignments;


public class SwappingPairsOfCharactersInStringPage4_2 {

    public static void main(String args[]) {
        String str = "GeeksForGeeks";
        
        if (str == null || str.isEmpty()) {
            System.out.println(str);
            return;
        }

        char[] ch = str.toCharArray();

        for (int i = 0; i < ch.length - 1; i += 2) {
            char temp = ch[i];
            ch[i] = ch[i + 1];
            ch[i + 1] = temp;
        }

        String result = new String(ch);
        System.out.println(result);
    }
}


