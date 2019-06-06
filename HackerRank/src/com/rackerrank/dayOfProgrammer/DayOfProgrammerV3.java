package com.rackerrank.dayOfProgrammer;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

public class DayOfProgrammerV3 {
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
		String result = "";

		Date a = new Date(year+ "/01/01");        
		a.setDate(a.getDate() + 256);     
		
		if(year > 1700 && year <= 1917) {
			if(year%div == 0) {
				
			}
		}
		 
		String formato = "dd/MM/yyyy";
		SimpleDateFormat dataFormatada = new SimpleDateFormat(formato); 
		System.out.println(dataFormatada.format(a));
		return result;
	}
}
