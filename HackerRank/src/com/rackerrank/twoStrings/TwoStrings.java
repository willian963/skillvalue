package com.rackerrank.twoStrings;

import java.util.HashMap;

public class TwoStrings {

	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = "world";
		System.out.println(twoStrings(s1, s2));
	}

	static String twoStrings(String s1, String s2) {
		String result = "NO";
		HashMap<String, String> mapOne = new HashMap();
		HashMap<String, String> mapTwo = new HashMap();
		if (null != s1 && null != s2) {
			for (int i = 0; i < s1.length(); i++) {
				if (validateNextChar(i, s1)) {
					String one = resolveNextChar(s1, i);
					if (!mapOne.containsKey(one)) {
						mapOne.put(one, one);
						for (int j = 0; j < s2.length(); j++) {
							if (validateNextChar(i, s2)) {
								String two = resolveNextChar(s2, j);
								if (mapTwo.containsKey(one)) {
									i = s1.length();
									result = "YES";
									break;
								}else {
									mapTwo.put(two, two);
									if (compare(one, two)) {
										i = s1.length();
										result = "YES";
										break;
									}
								}
							}
						}
					}
				}
			}
		}

		return result;

	}

	private static String resolveNextChar(String s1, int start) {
		return s1.substring(start, start + 1);
	}

	private static boolean validateNextChar(int i, String s) {
		boolean result = false;
		if (i + 1 < s.length()) {
			result = true;
		}
		return result;
	}

	private static boolean compare(String one, String two) {
		return one.equals(two);

	}
}
