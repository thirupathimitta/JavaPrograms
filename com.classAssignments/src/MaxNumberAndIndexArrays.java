
public class MaxNumberAndIndexArrays {

	public static void main(String[] args) {
		// assigment 4--max number in array and its index
		int[] arr = { 2, 5, 1, 9, 6 };
		
		
		int max = arr[0];
		int index = 0;

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
				index = i;
			}
		}
		System.out.println(index + " - " + max);

	}

}
