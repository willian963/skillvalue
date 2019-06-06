package com.rackerrank.welcomeJava;

import java.util.Scanner;

public class IfElse {
	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int N = scanner.nextInt();
		boolean flag = false;
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		if (N % 2 != 0) {
			System.out.println("Weird");
			flag = true;
		} else {
			if (N >= 2 && N <= 5) {
				System.out.println("Not Weird");
				flag = true;
			}
		}

		if (N >= 6 && N <= 20 && !flag) {
			System.out.println("Weird");
		} else {
			if (N > 20 && !flag) {
				System.out.println("Not Weird");
			}
		}

		scanner.close();
	}

}
