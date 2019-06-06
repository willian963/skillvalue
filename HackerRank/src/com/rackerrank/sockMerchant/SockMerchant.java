package com.rackerrank.sockMerchant;

import java.util.HashMap;

public class SockMerchant {

	public static void main(String[] args) {
		int ar[] = new int[] { 1, 1, 3, 1, 2, 1, 3, 3, 3, 3 };
		int n = 9;
		System.out.println(sockMerchant(n, ar));
	}

	// Complete the sockMerchant function below.
	static int sockMerchant(int n, int[] ar) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int result = 0;
		int pairs = 0;
		int count = 0;
		if (null != ar) {
			for (int i = 0; i < ar.length; i++) {
				count = 1;
				pairs = 1;
				if (!map.containsKey(ar[i])) {
					while (i + count < ar.length) {
						if (ar[i] == ar[i + count]) {
							pairs++;
							map.put(ar[i], ar[i]);
						}
						count++;
					}
					result = result + (pairs / 2);
				}
			}
		}
		return result;
	}

}
