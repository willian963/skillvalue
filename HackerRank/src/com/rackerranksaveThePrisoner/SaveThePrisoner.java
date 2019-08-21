package com.rackerranksaveThePrisoner;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class SaveThePrisoner {

	public static void main(String[] args) throws IOException {
		FileReader fileIn = new FileReader(System.getProperty("user.dir") + "/Inputs/SaveThePrisonerInput.txt");
		FileWriter fileOut = new FileWriter(System.getProperty("user.dir") + "/Outputs/SaveThePrisonerOutput.txt");

		BufferedReader bufferedReader = new BufferedReader(fileIn);
		BufferedWriter bufferedWriter = new BufferedWriter(fileOut);

		int t = Integer.parseInt(bufferedReader.readLine().trim());

		for (int tItr = 0; tItr < t; tItr++) {
			String[] nms = bufferedReader.readLine().split(" ");

			int n = Integer.parseInt(nms[0]);

			int m = Integer.parseInt(nms[1]);

			int s = Integer.parseInt(nms[2]);

			int result = saveThePrisoner(n, m, s);

			bufferedWriter.write(String.valueOf(result));
			bufferedWriter.newLine();
		}
		bufferedWriter.close();
	}

	static int saveThePrisoner(int n, int m, int s) {
		int pris = n;
		int cand = m;
		int start = s;
		int result = 0;

		for (int i = 1; i <= cand; i++) {
			result = start;
			if (start == pris) {
				start = 0;
			}
			start++;
		}

		return result;
	}

}
