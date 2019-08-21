package com.rackerrank.repeatedString;

public class RepeatedString {

	public static void main(String[] args) {
		//String s = "aba";
		//long n = 10;
		String s = "babbaabbabaababaaabbbbbbbababbbabbbababaabbbbaaaaabbaababaaabaabbabababaabaabbbababaabbabbbababbaabb";
		long n = 860622337747l;
		System.out.println(repeatedString(s, n));
	}

	static long repeatedString(String s, long n) {
 		long result = 0;
		String firstChar = "";
		if (null != s && s.length() > 0 && n > 0) {
			firstChar = s.substring(0, 0 + 1);
			if (s.length() == 1 && firstChar.equals("a")) {
				result = n;
			} else {
				for (int i = 0; i < n;) {
					for (int j = 0; j < s.length(); j++) {
						if (i < n) {
							String sub = s.substring(j, j + 1);
							if (sub.equals("a")) {
								result++;
							}
						}
						i++;
					}
				}
			}
		}
		return result;
	}
}
