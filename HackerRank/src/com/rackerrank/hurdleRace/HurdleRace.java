package com.rackerrank.hurdleRace;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class HurdleRace {

	public static void main(String[] args) throws IOException {
		FileReader fileIn = new FileReader(System.getProperty("user.dir") + "/Inputs/HurdleRaceInput.txt");
		FileWriter fileOut = new FileWriter(System.getProperty("user.dir") + "/Outputs/HurdleRaceOutput.txt");

		BufferedReader bufferedReader = new BufferedReader(fileIn);
		BufferedWriter bufferedWriter = new BufferedWriter(fileOut);

		String[] nk = bufferedReader.readLine().split(" ");

		int n = Integer.parseInt(nk[0]);

		int k = Integer.parseInt(nk[1]);

		int[] height = new int[n];

		String[] heightItems = bufferedReader.readLine().split(" ");

		for (int i = 0; i < n; i++) {
			int heightItem = Integer.parseInt(heightItems[i]);
			height[i] = heightItem;
		}

		int result = hurdleRace(k, height);

		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();

		bufferedWriter.close();

	}

	// Complete the hurdleRace function below.
	static int hurdleRace(int k, int[] height) {
		int result = 0;
		int biggerNum = 0;
		for(int i=0; i < height.length; i++) {
			if(height[i] > biggerNum) {
				biggerNum = height[i];
			}
		}
		
		if(biggerNum > k) {
			result = biggerNum - k;
		}

		return result;
	}

}
