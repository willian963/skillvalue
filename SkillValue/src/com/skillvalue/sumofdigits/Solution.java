package com.skillvalue.sumofdigits;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Arrays;

public class Solution {
	
		public static void main(String[] args) {
			System.out.println("Inputs      Expected");
			System.out.println("10          1");
			System.out.println("323         8");
			System.out.println("324         9");
			System.out.println("4242        12");
			System.out.println("324         10");
			BufferedReader in;
			args[0] = "C:/SkillValue/SkillValue/Inputs/SumOfDigits.txt";
			try {
				FileReader fr = new FileReader(new File(args[0]));
				BufferedReader buff = new BufferedReader(fr);
				String line = null;
				System.out.println("\nRESULTS");
				while ((line = buff.readLine()) != null) {
					int result = 0;
					Integer n = Integer.valueOf(line);

					/* YOUR CODE HERE */
					for (int i = 0; i < n.toString().length(); i++) {
						result = result + Integer.valueOf(line.substring(i, i + 1));
					}
					System.out.println(result);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
}
