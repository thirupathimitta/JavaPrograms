package com.methodsOnStrings;

public class CheckIfStringContainsOnlyAlphabetsPage4_11 {

	public static void main(String[] args) {
		
		String str= "hello wrold ";
		CheckIfStringContainsOnlyAlphabetsPage4_11 ob =new CheckIfStringContainsOnlyAlphabetsPage4_11();
		 boolean onlyAlphabet=ob.check(str);
		 if(onlyAlphabet) {
			 System.out.println("String \""+str+"\" contanis only alphabets "+onlyAlphabet);
		 }else System.out.println("String \""+str+"\"contanis only alphabets "+onlyAlphabet);

	}
	
	private boolean check(String str) {
		
		for(int i=0;i<str.length();i++) {
			char  c = str.toLowerCase().charAt(i);
//			if(!Character.isLetter(c)&&!Character.isWhitespace(c)) {
//				return false;
//				
//			}
			if (!((c >= 'a' && c <= 'z') ||c==' '|| c == '\t' || c == '\n' || c == '\r')) {
				return false;
			}
			
		}
		return true;
	}
	

}

