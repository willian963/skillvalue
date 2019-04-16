package com.rackerrank.bigsum;

public class BigSum {

	public static void main(String[] args) {
		long[] ar = new long[] { 1000000001, 1000000002, 1000000003, 1000000004, 1000000005 };

		aVeryBigSum(ar);
	}

	// Complete the aVeryBigSum function below.
	static long aVeryBigSum(long[] ar) {
		long result = 0;
		if (ar.length > 0) {
			for (int i = 0; i < ar.length; i++) {
				result = result + ar[i];
			}
		}
		System.out.println(result);
		return result;
	}
}
