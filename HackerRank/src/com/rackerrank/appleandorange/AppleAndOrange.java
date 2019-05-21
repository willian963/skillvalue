package com.rackerrank.appleandorange;

public class AppleAndOrange {

	public static void main(String[] args) {
		int s = 2;
		int t = 3;
		int a = 1;
		int b = 5;

		int[] apples = new int[] {2};
		int[] oranges = new int[] {-2};

		countApplesAndOranges(s, t, a, b, apples, oranges);
	}

	static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
		int numApples = 0;
		int numOranges = 0;

		if (null != apples && null != oranges && apples.length > 0 && oranges.length > 0) {
			for (int i = 0; i < apples.length; i++) {
				if (a + apples[i] >= s && a + apples[i] <= t) {
					numApples++;
				}
			}
			for (int i = 0; i < oranges.length; i++) {
				if (b + oranges[i] >= s && b + oranges[i] <= t) {
					numOranges++;
				}
			}
			System.out.println(numApples);
			System.out.println(numOranges);
		}
	}
}
