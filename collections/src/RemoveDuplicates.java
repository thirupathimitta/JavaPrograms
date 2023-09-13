import java.util.ArrayList;

public class RemoveDuplicates {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("hi");
		list.add("hello");
		list.add("how");
		list.add("hi");
		list.add("hii");
		list.add("hie");
		list.add("hii");
		list.add("hie");
		list.add("h");

		for (int i = 0; i < list.size(); i++) {

			String current = list.get(i);
			
			for (int j = i + 1; j < list.size(); j++) {
				if (current.equals(list.get(j))) {
					list.remove(j);
					j--;
				}
			}
		}

		System.out.println(list);

	}

}
