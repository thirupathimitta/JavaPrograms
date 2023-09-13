package oops_practice;

public class MyClass {
    private int number;
    private String text;

    public MyClass() {
        this(0, "Default");
    }

    public MyClass(int number) {
        this(number,"custom");
    }

    public MyClass(int number, String text) {
        this.number = number;
        this.text = text;
    }

    public int getNumber() {
        return number;
    }

    public String getText() {
        return text;
    }
    public static void main(String[] args) {
    	MyClass obj = new MyClass(); // Calls the default constructor
    	
    	System.out.println(obj.getNumber()); // Output: 0
    	System.out.println(obj.getText()); // Output: "Default"

//    	obj = new MyClass(10); // Calls the constructor with int parameter
//    	System.out.println(obj.getNumber()); // Output: 10
//    	System.out.println(obj.getText()); // Output: "Custom"
//
//    	obj = new MyClass(20, "Hello"); // Calls the constructor with int and String parameters
//    	System.out.println(obj.getNumber()); // Output: 20
//    	System.out.println(obj.getText()); // Output: "Hello"

		
	}
}

