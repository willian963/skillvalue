package com.skillvalue.checkvalue;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class solution {
	public static void main(String[] args) {

		args[0] = "C:/SkillValue/SkillValue/Inputs/CheckDigit.txt";
		BufferedReader in;
		try {

			// in = new BufferedReader(new FileReader(new File(args[0])));

			FileReader fr = new FileReader(new File(args[0]));
			BufferedReader buff = new BufferedReader(fr);
			String line = null;
			while ((line = buff.readLine()) != null) {

				//in = new BufferedReader(new FileReader(new File(args[0])));

				int i = 0;
				int result = 0;
				//line = in.readLine();
				int n = Integer.valueOf(line);
				String number = String.valueOf(line);
				/* YOUR CODE HERE */

				int w = 0;
				for (i = 0; i < number.length(); i++) {
					String numberResult = number.substring(i, i + 1);
					w = Integer.valueOf(numberResult);
					if (w != 0) {
						result = result + w;
						w = 0;
					}
				}
				if (result > 9) {
					String number2 = String.valueOf(result);
					result = 0;
					for (i = 0; i < number2.length(); i++) {
						String numberResult = number2.substring(i, i + 1);
						w = Integer.valueOf(numberResult);
						if (w != 0) {
							result = result + w;
							w = 0;
						}
					}
				}

				System.out.println(result);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}