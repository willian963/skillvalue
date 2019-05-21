package com.rackerrank.kangaroo;

public class Kangaroo {
	public static void main(String[] args) {
		int kangaroo1 = 21;
		int v1 = 6;
		int kangaroo2 = 47;
		int v2 = 3;
		System.out.println(kangaroo(kangaroo1, v1, kangaroo2, v2));
	}

	static String kangaroo(int x1, int v1, int x2, int v2) {
		String result = "NO";
		if (v1 != 0 && v2 != 0) {
			if (x1 != x2) {
				if (x1 < x2 && v1 < v2) {
					result = "NO";
				} else {
					while (x1 != x2 && x1 < x2) {
						x1 = x1 + v1;
						x2 = x2 + v2;
					}
					if (x1 == x2) {
						result = "YES";
					}
				}
			} else {
				result = "YES";
			}
		}
		return result;
	}
}
