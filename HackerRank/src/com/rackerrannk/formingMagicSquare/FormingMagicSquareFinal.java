package com.rackerrannk.formingMagicSquare;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FormingMagicSquareFinal {
	public static void main(String[] args) {
		int[][] s = new int[3][3];

		// RESULT 7
//		 s[0][0] = 5;
//		 s[0][1] = 3;
//		 s[0][2] = 4;
//		 s[1][0] = 1;
//		 s[1][1] = 5;
//		 s[1][2] = 8;
//		 s[2][0] = 6;
//		 s[2][1] = 4;
//		 s[2][2] = 2;

		// RESULT 1
//		 s[0][0] = 4;
//		 s[0][1] = 9;
//		 s[0][2] = 2;
//		 s[1][0] = 3;
//		 s[1][1] = 5;
//		 s[1][2] = 7;
//		 s[2][0] = 8;
//		 s[2][1] = 1;
//		 s[2][2] = 5;

		// RESULT 4
//		s[0][0] = 4;
//		s[0][1] = 8;
//		s[0][2] = 2;
//		s[1][0] = 4;
//		s[1][1] = 5;
//		s[1][2] = 7;
//		s[2][0] = 6;
//		s[2][1] = 1;
//		s[2][2] = 6;

		// RESULT 14
//		s[0][0] = 4;
//		s[0][1] = 5;
//		s[0][2] = 8;
//		s[1][0] = 2;
//		s[1][1] = 4;
//		s[1][2] = 1;
//		s[2][0] = 1;
//		s[2][1] = 9;
//		s[2][2] = 7;

		// RESULT 21
//		s[0][0] = 2;
//		s[0][1] = 9;
//		s[0][2] = 8;
//		s[1][0] = 4;
//		s[1][1] = 2;
//		s[1][2] = 7;
//		s[2][0] = 5;
//		s[2][1] = 6;
//		s[2][2] = 7;
		
		//RESULT 0
		s[0][0] = 4;
		s[0][1] = 9;
		s[0][2] = 2;
		s[1][0] = 3;
		s[1][1] = 5;
		s[1][2] = 7;
		s[2][0] = 8;
		s[2][1] = 1;
		s[2][2] = 6;

		System.out.println(formingMagicSquare(s));
	}

	static int formingMagicSquare(int[][] s) {
		ArrayList<int[][]> mirrorList = createMirros();
		Integer result = 0;
		Integer minimumValue = 0;
		boolean first = true;

		for (int[][] mirror : mirrorList) {
			int [][] compare = createCopy(s);
			for (Integer i = 0; i < compare.length; i++) {
				for (Integer j = 0; j < compare.length; j++) {
					if (compare[i][j] != mirror[i][j]) {
						//oldValue = compare[i][j];
						result = result + Math.abs(compare[i][j] - mirror[i][j]);
						compare[i][j] = mirror[i][j];
					}
				}
			}

			if (result <= minimumValue || first) {
					minimumValue = result;
			}
			first = false;
			result = 0;
		}

		return minimumValue;
	}

	private static ArrayList<int[][]> createMirros() {
		ArrayList<int[][]> mirrorList = new ArrayList<int[][]>();
		int[][] s0 = new int[3][3];
		s0[0][0] = 8;
		s0[0][1] = 1;
		s0[0][2] = 6;
		s0[1][0] = 3;
		s0[1][1] = 5;
		s0[1][2] = 7;
		s0[2][0] = 4;
		s0[2][1] = 9;
		s0[2][2] = 2;

		int[][] s1 = new int[3][3];
		s1[0][0] = 6;
		s1[0][1] = 1;
		s1[0][2] = 8;
		s1[1][0] = 7;
		s1[1][1] = 5;
		s1[1][2] = 3;
		s1[2][0] = 2;
		s1[2][1] = 9;
		s1[2][2] = 4;

		int[][] s2 = new int[3][3];
		s2[0][0] = 4;
		s2[0][1] = 9;
		s2[0][2] = 2;
		s2[1][0] = 3;
		s2[1][1] = 5;
		s2[1][2] = 7;
		s2[2][0] = 8;
		s2[2][1] = 1;
		s2[2][2] = 6;

		int[][] s3 = new int[3][3];
		s3[0][0] = 2;
		s3[0][1] = 9;
		s3[0][2] = 4;
		s3[1][0] = 7;
		s3[1][1] = 5;
		s3[1][2] = 3;
		s3[2][0] = 6;
		s3[2][1] = 1;
		s3[2][2] = 8;

		int[][] s4 = new int[3][3];
		s4[0][0] = 8;
		s4[0][1] = 3;
		s4[0][2] = 4;
		s4[1][0] = 1;
		s4[1][1] = 5;
		s4[1][2] = 9;
		s4[2][0] = 6;
		s4[2][1] = 7;
		s4[2][2] = 2;

		int[][] s5 = new int[3][3];
		s5[0][0] = 4;
		s5[0][1] = 3;
		s5[0][2] = 8;
		s5[1][0] = 9;
		s5[1][1] = 5;
		s5[1][2] = 1;
		s5[2][0] = 2;
		s5[2][1] = 7;
		s5[2][2] = 6;

		int[][] s6 = new int[3][3];
		s6[0][0] = 6;
		s6[0][1] = 7;
		s6[0][2] = 2;
		s6[1][0] = 1;
		s6[1][1] = 5;
		s6[1][2] = 9;
		s6[2][0] = 8;
		s6[2][1] = 3;
		s6[2][2] = 4;

		int[][] s7 = new int[3][3];
		s7[0][0] = 2;
		s7[0][1] = 7;
		s7[0][2] = 6;
		s7[1][0] = 9;
		s7[1][1] = 5;
		s7[1][2] = 1;
		s7[2][0] = 4;
		s7[2][1] = 3;
		s7[2][2] = 8;

		mirrorList.add(s0);
		mirrorList.add(s1);
		mirrorList.add(s2);
		mirrorList.add(s3);
		mirrorList.add(s4);
		mirrorList.add(s5);
		mirrorList.add(s6);
		mirrorList.add(s7);

		return mirrorList;

	}
	
	private static int[][] createCopy(int[][] s){
		int[][] arrayRetrun = new int[3][3];
		
		for (int i = 0; i < s.length; i++) {
			for (int j = 0; j < s.length; j++) {
				arrayRetrun[i][j] = s[i][j];
			}
		}
		return arrayRetrun;
	}
}