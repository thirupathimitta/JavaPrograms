import java.util.*;

public class MyDemo {

	public static void main(String[] args) {
		
	List<Integer> nums = new ArrayList<>();
	nums.add(1);
	nums.add(2);
//	nums.add("thiru");
	
	addMethod(nums);
	
	for(int i=0;i<nums.size();i++) {
		System.out.println(nums.get(i));
	}

	
	}
	public static void addMethod(List l) {
		l.add("thiru");
	}

}
