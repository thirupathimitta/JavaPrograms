package com.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupAndCountExample {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 1, 2, 1, 0};
        
        // Count occurrences and group elements by their counts
        Map<Integer, Long> groupedAndCounted = Arrays.stream(arr).boxed()
                .collect(Collectors.groupingBy(value -> value, Collectors.counting()));

        // Display the grouped and counted map
        System.out.println(groupedAndCounted);
    }
}
