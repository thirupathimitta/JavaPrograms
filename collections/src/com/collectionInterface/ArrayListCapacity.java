package com.collectionInterface;
import java.util.ArrayList;
import java.util.ArrayList;

public class ArrayListCapacity {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        // Initial capacity is zero
        System.out.println("Initial Capacity: " + list.size());

        // Adding elements to the list
        for (int i = 0; i <= 10; i++) {
            list.add("element" + i);
        }

        // Capacity increases as elements are added
        System.out.println("Final Capacity: " + list.size());
    }
}

