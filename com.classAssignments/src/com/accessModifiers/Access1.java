package com.accessModifiers;

public class Access1 {
	
	public class OuterClass {
		
	    private int privateMember= 20;

	    public class InnerClass {
	        public void accessPrivateMember() {
	            System.out.println(privateMember); 

	        }
	    }
	}
public static void main(String[] args) {
	Access1 access1 = new Access1();
	Access1.OuterClass.InnerClass innerClass = access1.new OuterClass().new InnerClass();
	innerClass.accessPrivateMember();
	
}

}
