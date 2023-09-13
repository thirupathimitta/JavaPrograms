package com.collectionInterface;
import java.util.*;

public class FindMaxKeyEntryInMap {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("ABC", 10);
        map.put("DEF", 30);
        map.put("XYZ", 20);

        printMap(map);

        Map.Entry<String, Integer> maxKeyEntry = getMaxKeyEntry(map);
        
        System.out.println("Entry with highest key: " + maxKeyEntry.getKey() + " => " + maxKeyEntry.getValue());
    }

    public static void printMap(Map<?, ?> map) {
        System.out.println("Map: " + map);
    }

    public static Map.Entry<String, Integer> getMaxKeyEntry(Map<String, Integer> map) {
        Map.Entry<String, Integer> maxKeyEntry = null;

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (maxKeyEntry == null || compareKeys(entry.getKey(), maxKeyEntry.getKey()) > 0) {
                maxKeyEntry = entry;
            }
        }

        return maxKeyEntry;
    }

    public static int compareKeys(String key1, String key2) {
        // Implement your custom key comparison logic here
        // Return a negative value if key1 < key2, 0 if key1 == key2, or a positive value if key1 > key2
        // For example: return key1.compareTo(key2);
        return 0; // Default comparison for illustration purposes
    }
}
