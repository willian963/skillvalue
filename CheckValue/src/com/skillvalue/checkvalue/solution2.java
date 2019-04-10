package com.skillvalue.checkvalue;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class solution2 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {

		args[0] = "C:/SkillValueGit/skillvalue/CheckValue/Inputs/CheckDigit.txt";
		try {

			// in = new BufferedReader(new FileReader(new File(args[0])));

			FileReader fr = new FileReader(new File(args[0]));
			BufferedReader buff = new BufferedReader(fr);
			String line = null;
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