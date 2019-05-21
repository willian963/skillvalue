package com.rackerank.betweentwosets;

public class BetweenTwoSets {

	public static void main(String[] args) {
		int[] a = new int[] { 2, 4 };
		int[] b = new int[] { 16, 32, 96 };
		getTotalX(a, b);
	}

	static int getTotalX(int[] a, int[] b) {
		int result = 0;
		int resultReturn = 0;
		for (int n = a[a.length - 1]; n >= a[a.length - 1] && n <= b[0]; n++) {
			for (int i = 0; i < a.length; i++) {
				if (n <= a[i]) {
					// System.out.println("a[i] " + a[i] +" divide "+ "N " + n
					// +" = "+ a[i]%n);
					result = a[i] % n;
				} else {
					// System.out.println("N " + n +" divide "+ "a[i] " + a[i]
					// +" = "+ n%a[i]);
					result = n % a[i];
				}
				if (result != 0) {
					result = -1;
					break;
				} else {
					// System.out.println("ValorA = " + n);
				}
			}
			if (result != -1) {
				for (int i = 0; i < b.length; i++) {
					if (n <= b[i]) {
						// System.out.println("a[i] " + b[i] +" divide "+ "N " +
						// n +" = "+ b[i]%n);
						result = b[i] % n;
					} else {
						// System.out.println("N " + n +" divide "+ "a[i] " +
						// b[i] +" = "+ n%b[i]);
						result = n % b[i];
					}
					if (result != 0) {
						result = -1;
						break;
					} else {
						// System.out.println("ValorB = " + n);
					}
				}
			}
			if (result == 0) {
				//System.out.println("Valor = " + n);
				resultReturn++;
			}
		}
		//System.out.println(resultReturn);
		return resultReturn;
	}
}
