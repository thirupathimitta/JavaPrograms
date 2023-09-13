package com.methodsOnStrings;

public class RemoveDuplicatesFromString {

    public static void main(String[] args) {
        String str = "thirupathi";

RemoveDuplicatesFromString obj = new RemoveDuplicatesFromString ();
        String result = obj.removeDuplicates(str);
        System.out.println(result);
    }

    public  String removeDuplicates(String str) {
        char[] arr = str.toCharArray();
        char[] arr1 = new char[arr.length];
        int newIndex = 0;

        for (int i = 0; i < arr.length; i++) {
            boolean isDuplicate = false;

            for (int j = 0; j < newIndex; j++) {
                if (arr[i] == arr1[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                arr1[newIndex] = arr[i];
                newIndex++;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < newIndex; i++) {
            sb.append(arr1[i]);
        }
        return sb.toString();
    }
}

