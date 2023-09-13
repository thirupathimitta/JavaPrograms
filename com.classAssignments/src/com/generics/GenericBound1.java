package com.generics;

import java.util.ArrayList;
import java.util.List;
public class GenericBound1 {

	    public static void addToList(List<? super Integer> list) {
	        list.add(42);
	    }

	    public static void main(String[] args) {
	        List<Number> numberList = new ArrayList<>();
	        List<Object> objectList = new ArrayList<>();

	        addToList(numberList);  
	        addToList(objectList);  

	        System.out.println(numberList); 
	        System.out.println(objectList);  
	    
	}


}
