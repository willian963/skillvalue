package com.rackerrank.repeatedString;

public class RepeatedString2 {

	public static void main(String[] args) {
		String s = "aba";
		long n = 10;
		System.out.println(repeatedString(s, n));
	}

	static long repeatedString(String s, long n) {
		long sumA = 0;
		long sumRestA = 0;
        long resultMath = 0;
        String firstChar = "";
        if (null != s && s.length() > 0 && n > 0) {
            firstChar = s.substring(0, 0 + 1);
            long div = n/s.length();
            long rest = (n%s.length());
            if (s.length() == 1 && firstChar.equals("a")) {
                resultMath = n;
            } else {
                for (int j = 0; j < s.length(); j++) {
                    String sub = s.substring(j, j + 1);
                    if (sub.equals("a")) {
                        sumA++;
                    }
                    if(j < rest && sub.equals("a")) {
                    	sumRestA++;
                    }
                }
            }
            resultMath = ((div*sumA) + sumRestA);
        }
        return resultMath;
	}
}
