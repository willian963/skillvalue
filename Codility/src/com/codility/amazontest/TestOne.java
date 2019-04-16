package com.codility.amazontest;

import java.util.ArrayList;

public class TestOne {

	public static void main(String args[]) {
		int a = 5;
		int b = 3;
		int numberOfLettersA = 0;
		int numberOfLettersB = 0;
		ArrayList<String> letterA = new ArrayList<String>();
		ArrayList<String> letterB = new ArrayList<String>();
		ArrayList<String> result = new ArrayList<String>();

		if (a > 0) {
			for (int i = 0; i < a; i++) {
				letterA.add("a");
			}
		}

		if (b > 0) {
			for (int i = 0; i < b; i++) {
				letterB.add("b");
			}
		}

		if (letterA.size() > letterB.size()) {
			result = addLetters(letterA, letterB, result);
		} else {
			result = addLetters(letterB, letterA, result);
		}
		if (!result.isEmpty()) {
			String clean = result.toString().replaceAll("[, ;]", "");
			clean = clean.replaceAll("[\\[\\](){}]", "");
			// System.out.println(clean.length());
			System.out.println(clean);
		}else{
			System.out.println(0);
		}
	}

	private static ArrayList<String> addLetters(ArrayList<String> letterA, ArrayList<String> letterB,
			ArrayList<String> result) {
		while (letterA.size() > 0 || letterB.size() > 0) {
			letterA = removeLetters(letterA, result);
			letterB = removeLetters(letterB, result);
		}
		return result;
	}

	private static ArrayList<String> removeLetters(ArrayList<String> letters, ArrayList<String> result) {
		if (letters.size() > 0) {
			for (int j = 0; j < 2; j++) {
				if (j < letters.size()) {
					result.add(letters.get(j));
				}
			}
			for (int j = 0; j < 2; j++) {
				if (!letters.isEmpty() && letters.size() > 0) {
					letters.remove(0);
				}
			}
		}
		return letters;

	}
}
