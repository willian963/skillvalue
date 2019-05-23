package com.rackerrannk.formingMagicSquare;

public class FormingMagicSquare2 {
	public static void main(String[] args) {
		int[][] s = new int[3][3];
		 s[0][0] = 4;
		 s[0][1] = 9;
		 s[0][2] = 2;
		 s[1][0] = 3;
		 s[1][1] = 5;
		 s[1][2] = 7;
		 s[2][0] = 8;
		 s[2][1] = 1;
		 s[2][2] = 5;
		
//		 s[0][0] = 4;
//		 s[0][1] = 8;
//		 s[0][2] = 2;
//		 s[1][0] = 4;
//		 s[1][1] = 5;
//		 s[1][2] = 7;
//		 s[2][0] = 6;
//		 s[2][1] = 1;
//		 s[2][2] = 6;

//		s[0][0] = 4;
//		s[0][1] = 5;
//		s[0][2] = 8;
//		s[1][0] = 2;
//		s[1][1] = 4;
//		s[1][2] = 1;
//		s[2][0] = 1;
//		s[2][1] = 9;
//		s[2][2] = 7;

		System.out.println(formingMagicSquare(s));
	}

	static int formingMagicSquare(int[][] s) {
		int result = 0;
		int vertical = 0;
		if (null != s && s.length > 0) {
			int line = 0;
			int compare = 0;
			boolean cont = false;
			int diff = 0;
			int index = 0;
			while (!cont) {
				for (int i = 0; i < s.length; i++) {
					for (int j = 0; j < s.length; j++) {
						line = line + s[i][j];
					}
					if (compare == line || compare == 0) {
						compare = line;
						line = 0;
						index++;
						continue;
					} else {
						diff = Math.abs(line - compare);
						vertical = 0;
						if (s[0][0] + s[1][0] + s[2][0] != compare) {
							vertical = 0;
						} else {
							if (s[0][1] + s[1][1] + s[2][1] != compare) {
								vertical = 1;
							} else {
								if (s[0][2] + s[1][2] + s[2][2] != compare) {
									vertical = 2;
								}
							}
						}
						result = alterValue(s, result, vertical, diff, index);
						index++;
						line = 0;
						//break;
					}
				}
				if (s[0][0] + s[0][1] + s[0][2] == compare && s[1][0] + s[1][1] + s[1][2] == compare
						&& s[2][0] + s[2][1] + s[2][2] == compare && s[0][0] + s[1][0] + s[2][0] == compare
						&& s[0][1] + s[1][1] + s[2][1] == compare && s[0][2] + s[1][2] + s[2][2] == compare) {
					
					if(s[0][0] + s[1][1] + s[2][2] == compare
						&& s[0][2] + s[1][1] + s[2][0] == compare){
						System.out.println("TRUE");
						cont = true;
					}else{
						int diffD = 0;
						if(s[0][0] + s[1][1] + s[2][2] != compare){
							diffD = Math.abs(s[0][0] + s[1][1] + s[2][2] - compare);
						}else{
							if(s[0][2] + s[1][1] + s[2][0] != compare){
								diffD = Math.abs(s[0][0] + s[1][1] + s[2][2] - compare);
							}
						}
						result = alterValue(s, result, vertical, diffD, index);
					}
					
				} else {
					System.out.println(
							"FALSE: " + "Compare: " + compare + " != " + "Sum linha 1: " + (s[0][0] + s[0][1] + s[0][2]));
					System.out.println(
							"FALSE: " + "Compare: " + compare + " != " + "Sum linha 2: " + (s[1][0] + s[1][1] + s[1][2]));
					System.out.println(
							"FALSE: " + "Compare: " + compare + " != " + "Sum linha 3: " + (s[2][0] + s[2][1] + s[2][2]));
					
					System.out.println(
							"FALSE: " + "Compare: " + compare + " != " + "Sum Coluna 1: " + (s[0][0] + s[1][0] + s[2][0]));
					System.out.println(
							"FALSE: " + "Compare: " + compare + " != " + "Sum Coluna 2: " + (s[0][1] + s[1][1] + s[2][1]));
					System.out.println(
							"FALSE: " + "Compare: " + compare + " != " + "Sum Coluna 3: " + (s[0][2] + s[1][2] + s[2][2]));

					System.out.println(
							"FALSE: " + "Compare: " + compare + " != " + "Sum Diagonal 1: " + (s[0][0] + s[1][1] + s[2][2]));
					System.out.println(
							"FALSE: " + "Compare: " + compare + " != " + "Sum Diagonal 2: " + (s[0][2] + s[1][1] + s[2][0]));
					result = 0;
					compare = 0;
					index = 0;
					cont = false;
				}
			}
		}
		for (int i = 0; i < s.length; i++) {
			String print = "";
			for (int j = 0; j < s.length; j++) {
				print = print + " " + s[i][j];
			}
			System.out.println(print);
		}
		return result;

	}

	private static int alterValue(int[][] s, int result, int vertical, int diff, int index) {
		if (s[index][vertical] + diff <= 9) {
			result = result + Math.abs(Math.abs(s[index][vertical] + diff) - s[index][vertical]);
			s[index][vertical] = s[index][vertical] + diff;
			//result = result + diff;
		} else {
			int minor = Math.abs(Math.abs(s[index][vertical] - diff) - s[index][vertical]);
			if(minor == 0){
				result = result + 1 + Math.abs(Math.abs(s[index][vertical] - diff) - s[index][vertical]);
				s[index][vertical] = 1 + Math.abs(s[index][vertical] - diff);
			}else{
				result = result + Math.abs(s[index][vertical] - diff);
				s[index][vertical] = Math.abs(s[index][vertical] - diff);
			}
			
			//result = result + diff;
		}
		return result;
	}
}
