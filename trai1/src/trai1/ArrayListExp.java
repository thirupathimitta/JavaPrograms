package trai1;

import java.util.*;


public class ArrayListExp {

	public static void main(String[] args) {
		
//		List<Integer> arr = new ArrayList();
//		
//		arr.add(1);						String
//		arr.add(2);
//		arr.add(4); StringBuffer
//		arr.add(5);
//		arr.add(6);
//		arr.add(2, 3);  100,101,102,103,104 --> obj(100,104)
//		System.out.println(arr);
//		List<Integer> s = new Stack();
//		s.add(1);
//		s.add(2);
//		s.add(3);
//		System.out.println(s); finalize()
		
		HashMap<Integer , Integer> h = new HashMap();  
		h.put(1,100);
		h.put(2,200);
		h.put(null, 1);
		h.put(null, null);
		h.replace(2, 200,400);
		System.out.println(h);
		LinkedHashSet l= new LinkedHashSet();
		l.add(null);
		l.add(null);
		l.add(2);
		System.out.println(l);
		TreeSet t = new TreeSet();
		t.add(1);
		t.add(null);
//		System.out.println(t);/NpE
		
	}
}
