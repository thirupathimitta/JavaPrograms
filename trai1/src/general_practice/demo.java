package general_practice;

public class demo{
	int fun1(int a,int b, int c) {
		return a+b+c;
	}

	public static void main(String[] args) {
		
		int x = new demo().fun1(23, 12, 1);
		System.out.println(x);
		demo y = new demo();
		System.out.println(y.fun1(23, 12, 1));

	}

}
