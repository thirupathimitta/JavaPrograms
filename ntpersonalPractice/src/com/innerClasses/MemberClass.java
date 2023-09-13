package com.innerClasses;

public class MemberClass {
	
	private int a;
	class member{
		void show() {
			a=20;
			System.out.println(a);
		}
		
	}

}
class call{
	
	public static void main(String[] args) {
		MemberClass  mc = new MemberClass();
		MemberClass.member m= mc.new member();
		m.show();
		
		
		
	}
}
