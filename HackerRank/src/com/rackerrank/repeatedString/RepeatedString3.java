package com.rackerrank.repeatedString;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class RepeatedString3 {

	public static void main(String[] args) {
		//String s = "beeaabc";
		//long n = 711560125001l;
		String s = "aba";
		long n = 10;
		System.out.println(repeatedString(s, n));
	}

	static long repeatedString(String s, long n) {
		
		System.out.println(new Double(n/s.length()));
		System.out.println(new Double(n%s.length()));
		
		String rest = new Double(n/s.length()).toString();
		
		System.out.println("Rest: " + rest);
		if(rest.contains("E")) {
			System.out.println(true);
		}
		
		return 0;
	}
}
