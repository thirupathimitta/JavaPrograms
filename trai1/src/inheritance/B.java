package inheritance;

public class B extends A {
	
	 B() {
		
		 this(200.22f);
		System.out.println("class B");
	 }
	 B(float a){
		 this(23);
		 System.out.println(a);
	 }
	 B(int y){
		 
		 System.out.println(y);
	 }
	public static void main(String[] args) {
	 new B();		
			int x =10;
			int y=23;
		String result= 10<23 ?"yes": "no";
		
		System.out.println(result);
	}

}
