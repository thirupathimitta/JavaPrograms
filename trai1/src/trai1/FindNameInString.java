package trai1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindNameInString {
	public static void main(String[] args) {
		String inputString = "a,a,b,b,c,c,d,d,e,e,f,f,g,g,h,h,i,i,j,j,k,k,l,thiru,l,m,m,n,n,n,o,p,q,q,r,s,t,t,u,v,w,x,y,z,z";
		String nameToFind = "thiru";

		// Create a case-insensitive regex pattern for the name
		Pattern pattern = Pattern.compile("\\b" + Pattern.quote(nameToFind) + "\\b", Pattern.CASE_INSENSITIVE);

		// Create a matcher for the input string
		Matcher matcher = pattern.matcher(inputString);

		// Find and print the matched name(s)
		while (matcher.find()) {
			String foundName = matcher.group();
			System.out.println("Found name: " + foundName);
		}
	}
}
