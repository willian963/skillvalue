package com.rackerrank.plusMinus;

public class PlusMinus {

	public static void main(String[] args) {
		int[] ar = new int[] { -4, 3, -9, 0, 4, 1 };
		plusMinus(ar);
	}

	// Complete the plusMinus function below.
	static void plusMinus(int[] arr) {
		if(arr.length > 0){
		int pos = 0;
		int neg = 0;
		int zero = 0;

		for (int r : arr) {
			if (r == 0) {
				zero++;
			} else {
				if (r > 0) {
					pos++;
				} else {
					neg++;
				}
			}
		}
		System.out.println(new Float(pos)/new Float(arr.length));
		System.out.println(new Float(neg)/new Float(arr.length));
		System.out.println(new Float(zero)/new Float(arr.length));
		}
	}

}
