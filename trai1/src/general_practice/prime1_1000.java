package general_practice;

public class prime1_1000 {

	public static void main(String[] args) {
		for(int x=1;x<=1000;x++) {
			
		
		if(isprime(x)) {
			System.out.println(x +" is prime");
		}
//		}else {
//			System.out.println(x+" is not prime");
//		}
	}
	}
	public static boolean isprime(int n) {
		
		if(n<=1) {
		return false;
		}
			
		for(int i =2;i<=n/2;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
		
	

	}

}
