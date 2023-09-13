package multiArrays;

public class AddTwoArrays {

	public static void main(String[] args) {
		int[][] arr = {
				{1,4,8},
				{9,7,2},
				{7,6,4}		
		};
		int[][] arr1 = {
				{1,4,8},
				{9,7,2},
				{7,6,4}		
		};
		int[][] arr2 =new int[arr.length][arr[0].length];
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr2[i][j]=arr[i][j]+arr1[i][j];
			}
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr2[i][j]+" ");
			}
			System.out.println();
		}

	}

}
