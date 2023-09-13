package com.arrraysPractice;

import java.util.Arrays;

public class BinarySearchArrayProblem19 {

    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
        Arrays.sort(arr);
        int target = 95;
        int first = 0;
        int last = arr.length - 1;
        int found = 0;

        while (first <= last) {
            int mid = (first + last) / 2; 
            
            if (arr[mid] == target) {
                System.out.println(mid);
                found = 1;
                break;
            } else if (arr[mid] > target) {
                last = mid - 1;
                
            } else {
                first = mid + 1;
            }
        }
        
        if (found == 0 && first > last) {
            System.out.println("The element " + target + " is not found.");
        }
    }
}
