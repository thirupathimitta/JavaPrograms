
public class CountPositiveNegativeAndZeroArrayProblem30 {

	public static void main(String[] args) {
		int arr []= {1,2,3,4,5,0,0,-3,-4,-5,-6,0,0,-2,4,2,-4,-1,9};
		
		int pCount=0;
		int nCount =0;
		int zcount=0;
		for(int x:arr) {
			if(x>0) pCount++;
			else if(x<0) nCount++;
			else zcount++;
		}
		System.out.println(pCount+" "+nCount+" "+ zcount );
	}

}
