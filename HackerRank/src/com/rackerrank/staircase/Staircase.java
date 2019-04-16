package com.rackerrank.staircase;

public class Staircase {

	public static void main(String[] args) {
		staircase(6);
	}

	// Complete the staircase function below.
	static void staircase(int n) {
		if (n > 0) {
			int arrSize = n;
			for (int i = 1; i <= n; i++) {
				String print = "";
				for (int j = 1; j < arrSize; j++) {
					print = print.concat(" ");
				}
				arrSize--;
				for (int z = 0; z < i; z++) {
					print = print.concat("#");
				}
				System.out.println(print);
			}
		}
	}
}
