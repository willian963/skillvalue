package com.rackerrank.countingValleys;

import java.util.HashMap;

public class CountingValleys {

	public static void main(String[] args) {
		int n = 12;
		String s = "DDUUDDUDUUUD";
		System.out.println(countingValleys(n, s));
	}
	
	static int countingValleys(int n, String s) {
		String stringHike = "";
		int hike = 0;
		int result = 0;
		if(null != s) {
			for(int i=0; i < s.length(); i++) {
				if(i+1 <= s.length()) {
					stringHike = s.substring(i, i+1);
					if(stringHike.equals("U") && hike == -1) {
						result++;
					}
					hike = validateHike(stringHike, hike);
				}
			}
		}
		return result;
    }

	private static int validateHike(String stringHike, int hike) {
		if(stringHike.equals("U")) {
			hike = hike + 1;
		}
		if(stringHike.equals("D")) {
			hike = hike - 1;
		}
		return hike;
	}
}
