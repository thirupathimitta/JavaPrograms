package com.streams;

public class MaoExp4AllMatch {

	public static void main(String[] args) {

		String s = "7013528395";

		boolean isNumber = s.chars().allMatch(c -> Character.isDigit(c));
		boolean isNumber1 = s.chars().allMatch(Character::isDigit);
		System.out.println(isNumber1);
	}

	

}
