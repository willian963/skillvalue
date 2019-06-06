package com.rackerrank.welcomeJava;

import java.util.Scanner;

public class StdinStdout {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		for(int i=1; i<=3; i++) {
		System.out.println("Enter value " + i);
		int myInt = scanner.nextInt();

		System.out.println(myInt);
		}
		scanner.close();
	}
}