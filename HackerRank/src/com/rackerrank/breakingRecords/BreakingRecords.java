package com.rackerrank.breakingRecords;

public class BreakingRecords {
	public static void main(String[] args) {
		int[] s = new int[] { 10, 5, 20, 20, 4, 5, 2, 25, 1 };
		String print = "";
		
		int[] res = breakingRecords(s);
		for(Integer r : res) {
			print = print.concat(r.toString().concat(" "));
		}
		System.out.println(print);
	}

	// Complete the breakingRecords function below.
	static int[] breakingRecords(int[] s) {
		int max = 0;
		int numMax = 0;
		int min = 0;
		int numMin = 0;
		
		int[] result = new int[2];
		if(null != s) {
			for(int i=0; i < s.length; i++) {
				if(s[i] > max) {
					max = s[i];
					if(i != 0) {
						numMax++;
					}
				}
				if(s[i] < min || i==0) {
					min = s[i];
					if(i != 0) {
					numMin++;
					}
				}
			}
		}
		result[0] = numMax;
		result[1] = numMin;
		return result;
	}

}
