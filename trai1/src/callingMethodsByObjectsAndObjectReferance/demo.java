package callingMethodsByObjectsAndObjectReferance;

public class demo {
	//methods

	int add(int a, int b) {
		return a+b;
	}
	void max(float a, float b) {}
	boolean get() { return true;}
	void display() {};
	static int cube(int a) {
		return a;
	}
	static void min (double a,double b) {};
	static long getValue() {
		return 234;
	}
	static void show() {};
	int[] sort(int[] a) {
		return a;
	}
	void search(float[] a, float []b) {};
	int[] getElements() {
		int[]a = {23,45,45};
		return a;
	}
	void print() {}
	static boolean sort (double[] a) {
		return true;
	}
	static void max(float[] a) {}
	static double [] getValues(){
		double [] a = {23,43,5};
		return a;
	}
	static void displayValue() {}
	int getValuess() { return 23;}
	static boolean getBoolean() {
		return true;
	}
	char[] getChars() {
		char[] a= {'a','b'};
		return a;
	}
	static void printValue() {}
	
	public static void main(String[] args) {
	demo d = new demo();
	d.add(2, 4);
	d.max(2.2f, 3.2f);
	d.get();
	d.display();
	demo.cube(1);
	demo.min(1.1, 2.2);
	demo.getValue();
	demo.show();
	d.sort(new int[] {2,3,4});
	d.search(new float[] {2.23f,43.34f}, new float[] {1.2f,3.3f});
	d.print();
	demo.sort(new double [] {23.3,345.45});
	demo.max(new float[] {2.3f,34.5f});
	demo.getValues();
	demo.displayValue();
	d.getValuess();
	demo.getBoolean();
	d.getChars();
	demo.printValue();
	
	}

} 
