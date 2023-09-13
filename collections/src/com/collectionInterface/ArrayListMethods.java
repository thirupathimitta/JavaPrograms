package com.collectionInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListMethods {

	public static void main(String[] args) {

		List<String> list = new ArrayList();
		
		// 1. add(Object obj)
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        // 2. add(int index, Object)
        
        list.add(1, "Orange"); // Adds "Orange" at index 1
        System.out.println(list);
        
        // 3. addAll(Collection c)
        

        List<String> additionalFruits = Arrays.asList("Grapes", "Mango");
        
        list.addAll(additionalFruits);
        System.out.println(list);
        // 4. remove(Object obj)
        list.remove("Cherry");

        // 5. remove(int index)
        list.remove(0); // Removes the first element

        // 6. get(int index)
        
        String firstFruit = list.get(0);

        // 7. contains(Object obj)
        boolean containsMango = list.contains("Mango");
        System.out.println(containsMango);
        
        
        list.addAll(Arrays.asList("kiwi","guva","pinapple"));
        
     // 8. clear()
//        list.clear();
     // 9. isEmpty()
        boolean empty = list.isEmpty();
//        System.out.println(empty);
        
        // 10. retainAll(Collection c)
        List<String> fruitsToKeep = Arrays.asList("Apple", "Banana", "Cherry");
        list.retainAll(fruitsToKeep);//keep same elements which are present in both lists
        
        //retainAll == intersection 
        
        // 11. indexOf(Object obj)
        int bananaIndex = list.indexOf("Banana");
        System.out.println(bananaIndex);
        list.addAll(Arrays.asList("kiwi","guva","Banana","pinapple","Banana","guva"));
        
     // 12. lastIndexOf(Object obj)
        int lastIndex = list.lastIndexOf("Banana");
        System.out.println(lastIndex);
        
        

        // 14. iterator()
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String fruit = iterator.next();
            System.out.println(fruit);
        }
        
        // 15. listIterator()
        ListIterator<String> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            String fruit = listIterator.next();
            System.out.println(fruit);
        }
        while (listIterator.hasPrevious()) {
            String fruit = listIterator.previous();
            System.out.println(fruit);
        }
        
        list.forEach(i -> {
			System.out.println(i);
		});
        
        
        
        System.out.println(list);
		
	}

}
