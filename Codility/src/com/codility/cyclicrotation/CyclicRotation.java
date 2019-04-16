package com.codility.cyclicrotation;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class CyclicRotation {

	public static void main(String args[]) throws IOException {
		System.out.println("TIMES         INPUTS                 Expected");
		System.out.println("3             [3, 8, 9, 7, 6]        [9, 7, 6, 3, 8]");
		System.out.println("4             [1, 2, 3, 4]           [1, 2, 3, 4]");
		System.out.println("1             [0,0,0,]               [0,0,0]");
		BufferedReader in;
		args[0] = "C:/SkillValue/CyclicRotation/Inputs/CyclicRotation.txt";
		try {
			FileReader fr = new FileReader(new File(args[0]));
			BufferedReader buff = new BufferedReader(fr);
			String line = null;
			System.out.println("\nRESULTS");
			while ((line = buff.readLine()) != null) {
				Integer n = Integer.valueOf(line);
				int[] a = new int[n.toString().length() - 1];
				int repetions = Integer.valueOf(line.substring(0, 1));
				int initArray = 1;
				for (int i = 0; initArray < n.toString().length(); i++) {
					a[i] = new Integer(Integer.valueOf(line.substring(initArray, initArray + 1)));
					initArray++;
				}
				int[] result = solution(a, repetions);
				ArrayList<Integer> print = new ArrayList<Integer>();
				for (int i1 = 0; i1 < result.length; i1++) {
					print.add(result[i1]);
				}
				System.out.println(print.toString());
			}
		} finally {

		}
	}

	public static int[] solution(int[] a, int key) {
		int[] b = new int[a.length];
		if (null != a && a.length > 0) {
			if (key > 0) {
				for (int i = 0; i < key; i++) {
					b[0] = a[a.length - 1];
					int next = 1;
					for (int j = 0; next < b.length; j++) {
						b[next] = a[j];
						next++;
					}
					for (int j = 0; j < a.length; j++) {
						a[j] = b[j];
					}
				}
				return b;
			}else{
				return b = a;
			}
		}
		return new int[0];
	}
}