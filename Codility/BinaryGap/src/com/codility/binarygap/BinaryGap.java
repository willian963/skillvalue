package com.codility.binarygap;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

//you can also use imports, for example:
//import java.util.*;

//you can write to stdout for debugging purposes, e.g.
//System.out.println("this is a debug message");

public class BinaryGap {

	@SuppressWarnings({ "resource", "unused" })
	public static void main(String args[]) throws IOException {
		System.out.println("Inputs      Expected");
		System.out.println("1041        5");
		System.out.println("15          0");
		System.out.println("32          0");
		System.out.println("9           2");
		System.out.println("529         4");
		System.out.println("20          1");
		BufferedReader in;
		args[0] = "C:/SkillValueGit/skillvalue/BinaryGap/Inputs/BinaryGap.txt";
		try {
			FileReader fr = new FileReader(new File(args[0]));
			BufferedReader buff = new BufferedReader(fr);
			String line = null;
			System.out.println("\nRESULTS");
			while ((line = buff.readLine()) != null) {
				System.out.println(solution(Integer.valueOf(line)));
			}
		}finally {
			
		}
	}

	public static int solution(int n) {
		int lastResult = 0;
		if (null != new Integer(n) && n != 0) {
			String number = Integer.toBinaryString(n);
			int resultReturn = 0;
			
			for (int i = 0; i < number.toString().length(); i++) {
				int result = Integer.valueOf(number.substring(i, i + 1));
				if (result == 0) {
					resultReturn++;
				} else {
					if (resultReturn > lastResult) {
						lastResult = resultReturn;
					}
					resultReturn = 0;
				}
			}
			return lastResult;
		}
		return lastResult;

	}
}
