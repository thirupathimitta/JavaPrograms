import java.util.Arrays;

public class DisplayEvenAndOddNumbersArrayProblem27 {

	public static void main(String[] args) {
		int[]arr = {1,2,3,4,5,6,7,8,9,11};
		int even =0;
		int odd=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				even++;
			}else odd++;
		}
		

		int [] evenArray =new int[even];
		int [] oddArray =new int[odd];
		
		for(int i=0,j=0,k=0;i<arr.length;i++) {
			
			if(arr[i]%2==0) {
				evenArray[j]=arr[i];
				j++;
			}	else {
				oddArray[k]=arr[i];
				k++;
			}
		}
		System.out.println("even numbers are:-");
		for(int x:evenArray) {
			System.out.print(x+" ");
		}
		System.out.println();
		System.out.println("odd numbers are:-");
		for(int x:oddArray) {
			System.out.print(x+" ");
		}
	}
}




