package trai1;

public class A {
	int i= m1();
	public A(){
		System.out.println("constructor");
	}

	private int m1() {
		System.out.println("m1 method");
		return 20;
	}
	
	{
		System.out.println("instance ");
	}
	
	 public static void main(String[] args) {
		
		 A a=new A();
	}
}
