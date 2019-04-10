package com.skillvalue.checkvalue;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class solution2 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {

		System.out.println("Inputs      Expected");
		System.out.println("101         2");
		System.out.println("3299        5");
		System.out.println("904         4");
		System.out.println("4772        2");
		System.out.println("385         7");
		args[0] = "C:/SkillValueGit/skillvalue/CheckValue/Inputs/CheckDigit.txt";
		try {

			// in = new BufferedReader(new FileReader(new File(args[0])));
			String x = new String("xyz");
			String y = "abc";
			System.out.println(x+y);

			FileReader fr = new FileReader(new File(args[0]));
			BufferedReader buff = new BufferedReader(fr);
			String line = null;
			System.out.println("\nRESULTS");
			while ((line = buff.readLine()) != null) {

				//in = new BufferedReader(new FileReader(new File(args[0])));

				int i = 0;
				int result = 0;
				Integer n = Integer.valueOf(line);

				for (i = 0; i < n.toString().length(); i++) {
						result = result + Integer.valueOf(line.substring(i, i+1));
				}
				if(result > 9){
					String number2 = String.valueOf(result);
					result = 0;
					for (i = 0; i < number2.toString().length(); i++) {
						result = result + Integer.valueOf(number2.substring(i, i+1));
					}
				}
				System.out.println(result);
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}