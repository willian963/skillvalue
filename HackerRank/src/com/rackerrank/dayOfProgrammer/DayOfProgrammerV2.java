package com.rackerrank.dayOfProgrammer;

import java.util.HashMap;

public class DayOfProgrammerV2 {
	public static void main(String[] args) {
		int[] years = new int[] { 1783, 1800, 1918, 2400, 2016, 2017, 2700, 2600 };

//		for(int year : years) {
//			System.out.println(dayOfProgrammer(year)+"\n");
//		}

		int year = 1918; // 2400
		System.out.println(dayOfProgrammer(year) + "\n");
	}

	// Complete the dayOfProgrammer function below.
	static String dayOfProgrammer(int year) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		map.put(1984, 12);
		map.put(1783, 13);
		map.put(1800, 12);
		map.put(1918, 26);
		map.put(2400, 12);
		map.put(2000, 12);
		map.put(2016, 12);
		map.put(2017, 13);
		map.put(2700, 13);
		map.put(2600, 13);
		map.put(2100, 13);

		int div = 4;
		int hundred = 100;
		int d = 0;

		System.out.println(year % div);
		System.out.println(year % hundred);

		String result = "";

		if (year > 1918) {

			if (year % div == 0 && year % hundred != 0) {
				d = 12;
				result = "12.09.".concat(new Integer(year).toString());
			} else {
				d = 13;
				result = "13.09.".concat(new Integer(year).toString());
			}
		} else {

			if (year <= 1918 && year % div != 0) {
				d = 26;
				result = "26.09.".concat(new Integer(year).toString());
			} else {

				if (year % div == 0) {
					d = 12;
					result = "12.09.".concat(new Integer(year).toString());
				} else {
					d = 13;
					result = "13.09.".concat(new Integer(year).toString());
				}
			}
		}

		if (map.get(year) == d) {
			System.out.println("SUCCESS");
			System.out.println("EXPECTED " + map.get(year) + " GOT: " + d);
			System.out.println("Year: " + year + " = " + result);
		} else {
			System.out.println("ERROR");
			System.out.println("EXPECTED " + map.get(year) + " GOT: " + d);
			System.out.println("Year: " + year + " = " + result);
		}
		return result;
	}
}
