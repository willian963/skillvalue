package com.rackerrank.test;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {
		String a = "numero a";
		String b = "numero b";
		System.out.println(twoStrings(a, b));
    }
	
	static boolean twoStrings(String s1, String s2) {
		Set<String>  stringSet = Arrays.stream(s1.split(""))
                .collect(Collectors.toSet());
		System.out.println(stringSet);
		
		String[] s2Array = s2.split("");
		
		for(String a : s2Array) {
			System.out.println(a);
		}

	 return s1.split("").equals(s2.split(""));
	}
}
