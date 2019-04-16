package com.rackerrank.diagonal;

public class Diagonal {

	public static void main(String[] args) {
		int[][] ar = new int[3][3];

		ar[0][0] = 11;
		ar[0][1] = 2;
		ar[0][2] = 4;

		ar[1][0] = 4;
		ar[1][1] = 5;
		ar[1][2] = 6;

		ar[2][0] = 10;
		ar[2][1] = 8;
		ar[2][2] = -12;

		diagonalDifference(ar);

		// diagonalDifference(ar);
	}

	// Complete the diagonalDifference function below.
	static int diagonalDifference(int[][] ar) {
		int sumA = 0;
		int sumB = 0;
		int result = 0;
		if (null!= ar && ar.length > 0) {
			for (int i = 0; i < ar.length; i++) {
				// System.out.println(ar[i][i]);
				sumA = sumA + ar[i][i];
			}

			int w = 0;
			for (int j = ar.length - 1; j >= 0; j--) {
				// System.out.println(ar[w][j]);
				sumB = sumB + ar[w][j];
				w++;
			}
			System.out.println(Math.abs(sumA - sumB));
			result = Math.abs(sumA - sumB);
		}
		return result;

	}

}
