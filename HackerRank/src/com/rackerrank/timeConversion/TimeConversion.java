package com.rackerrank.timeConversion;

public class TimeConversion {

	public static void main(String[] args) {
		String time = "12:40:22AM";
		System.out.println(timeConversion(time));
	}

	static String timeConversion(String s) {
		String result = "";
		if (null != s && !s.isEmpty()) {

			if (s.substring(s.length() - 2, s.length()).equals("PM")) {
				result = s.substring(0, s.length() - 2);
				result = pmConvertion(result);
			}
			if (s.substring(s.length() - 2, s.length()).equals("AM")) {
				result = s.substring(0, s.length() - 2);
				result = amConvertion(result);
			}
		}
		return result;
	}

	static String pmConvertion(String result) {
		switch (result.substring(0, 2)) {
		case "00":
			result = result.replace("00", "12");
			break;
		case "01":
			result = result.replace("01", "13");
			break;
		case "02":
			result = result.replace("02", "14");
			break;
		case "03":
			result = result.replace("03", "15");
			break;
		case "04":
			result = result.replace("04", "16");
			break;
		case "05":
			result = result.replace("05", "17");
			break;
		case "06":
			result = result.replace("06", "18");
			break;
		case "07":
			result = result.replace("07", "19");
			break;
		case "08":
			result = result.replace("08", "20");
			break;
		case "09":
			result = result.replace("09", "21");
			break;
		case "10":
			result = result.replace("10", "22");
			break;
		case "11":
			result = result.replace("11", "23");
			break;
		default:
		}
		return result;
	}
	
	static String amConvertion(String result) {
		switch (result.substring(0, 2)) {
		case "12":
			result = result.replace("12", "00");
			break;
		case "13":
			result = result.replace("13", "1");
			break;
		case "14":
			result = result.replace("14", "2");
			break;
		case "15":
			result = result.replace("15", "3");
			break;
		case "16":
			result = result.replace("16", "4");
			break;
		case "17":
			result = result.replace("17", "5");
			break;
		case "18":
			result = result.replace("18", "6");
			break;
		case "19":
			result = result.replace("19", "7");
			break;
		case "20":
			result = result.replace("20", "8");
			break;
		case "21":
			result = result.replace("21", "9");
			break;
		case "22":
			result = result.replace("22", "10");
			break;
		case "23":
			result = result.replace("23", "11");
			break;
		default:
		}
		return result;
	}
	
}
