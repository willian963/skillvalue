package com.rackerrank.testes;

public class Teste2 {

	public static void main(String[] args) {
		int n = 3;
		int m = 7;
		int s = 3;

		int a = s + m - 1;
		if (a > n) {
			if (a % n == 0) {
				System.out.println("a%n:" + a % n);
				System.out.println("N: " + n);
			}else {
			System.out.println("a%n: " + a % n);
			}
		} else {
			System.out.println("A: " + a);
		}
	}

}
