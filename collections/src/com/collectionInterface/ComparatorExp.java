package com.collectionInterface;

import java.util.Comparator;
import java.util.TreeSet;

class MyComparator implements Comparator{

	

	@Override
	public int compare(Object o1, Object o2) {
		Integer i1 = (Integer) o1;
		Integer i2 = (Integer) o2;
		if(i1>i2) {
			return -1;
		}else if(i1<i2) {
			return +1;
		}
		else
		return 0;
	}
	
}
public class ComparatorExp {

	public static void main(String[] args) {
		TreeSet<Integer> t = new TreeSet(new MyComparator());
		t.add(1);
		t.add(3);
		t.add(5);
		t.add(7);
		t.add(0);
		System.out.println(t);

	}
}

