package com.rackerrank.dayOfProgrammer;

import java.util.HashMap;

public class DayOfProgrammer {
	public static void main(String[] args) {
		int[] years = new int[] { 1783, 1800, 1918, 2400, 2016, 2017, 2700, 2600 };

		for(int year : years) {
			System.out.println(dayOfProgrammer(year)+"\n");
		}

	}

	// Complete the dayOfProgrammer function below.
	static String dayOfProgrammer(int year) {
		int div = 4;
		int hundred = 100;
		int fourHundred = 400;
		int d = 0;

		String result = "";

		if (year != 1918) {

			if (year > 1700 && year <= 1917) {
				if (year % div == 0) {
					d = 12;
					result = "12.09.".concat(new Integer(year).toString());
				} else {
					d = 13;
					result = "13.09.".concat(new Integer(year).toString());
				}
			} else {
				if (year > 1918) {
					if ((year % div == 0 && year % hundred != 0) ||  year % fourHundred == 0) {
						d = 12;
						result = "12.09.".concat(new Integer(year).toString());
					} else {
						d = 13;
						result = "13.09.".concat(new Integer(year).toString());
						}
				}
			}
		} else {
			d = 26;
			result = "26.09.".concat(new Integer(year).toString());
		}

		return result;
	}
}
