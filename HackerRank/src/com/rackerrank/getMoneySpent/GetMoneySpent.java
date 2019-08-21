package com.rackerrank.getMoneySpent;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class GetMoneySpent {

	public static void main(String[] args) throws IOException {
		FileReader fileIn = new FileReader(System.getProperty("user.dir") + "/Inputs/GetMoneySpentInput.txt");
		FileWriter fileOut = new FileWriter(System.getProperty("user.dir") + "/Outputs/GetMoneySpentOutput.txt");

		BufferedReader bufferedReader = new BufferedReader(fileIn);
		BufferedWriter bufferedWriter = new BufferedWriter(fileOut);

		String[] bnm = bufferedReader.readLine().split(" ");
		// scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

		int b = Integer.parseInt(bnm[0]);

		int n = Integer.parseInt(bnm[1]);

		int m = Integer.parseInt(bnm[2]);

		int[] keyboards = new int[n];

		String[] keyboardsItems = bufferedReader.readLine().split(" ");
		// scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

		for (int keyboardsItr = 0; keyboardsItr < n; keyboardsItr++) {
			int keyboardsItem = Integer.parseInt(keyboardsItems[keyboardsItr]);
			keyboards[keyboardsItr] = keyboardsItem;
		}

		int[] drives = new int[m];

		String[] drivesItems = bufferedReader.readLine().split(" ");
		// scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

		for (int drivesItr = 0; drivesItr < m; drivesItr++) {
			int drivesItem = Integer.parseInt(drivesItems[drivesItr]);
			drives[drivesItr] = drivesItem;
		}

		/*
		 * The maximum amount of money she can spend on a keyboard and USB drive, or -1
		 * if she can't purchase both items
		 */

		int moneySpent = getMoneySpent(keyboards, drives, b);

		bufferedWriter.write(String.valueOf(moneySpent));
		bufferedWriter.newLine();

		bufferedWriter.close();
	}

	/*
	 * Complete the getMoneySpent function below.
	 */
	static int getMoneySpent(int[] keyboards, int[] drives, int b) {
		int sumPrize = -1;
		for(int i=0; i < keyboards.length; i++) {
			for(int j=0; j < drives.length; j++) {
				int sum = keyboards[i] + drives[j];
				sumPrize = validateRule(sumPrize, sum, b);
			}
		}
		
		return sumPrize;

	}

	private static int validateRule(int sumPrize, int sum, int b) {
		int result = sumPrize;
		if(sum > sumPrize && sum <= b) {
			result = sum;
		}
		return result;
	}

}
