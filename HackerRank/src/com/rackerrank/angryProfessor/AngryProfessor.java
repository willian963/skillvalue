package com.rackerrank.angryProfessor;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class AngryProfessor {


	public static void main(String[] args) throws IOException {
		FileReader fileIn = new FileReader(System.getProperty("user.dir") + "/Inputs/AngryProfessorInput.txt");
		FileWriter fileOut = new FileWriter(System.getProperty("user.dir") + "/Outputs/AngryProfessorOutput.txt");

		BufferedReader bufferedReader = new BufferedReader(fileIn);
		BufferedWriter bufferedWriter = new BufferedWriter(fileOut);

		int t = Integer.parseInt(bufferedReader.readLine().trim());

		for (int tItr = 0; tItr < t; tItr++) {
			String[] nk = bufferedReader.readLine().split(" ");

			int n = Integer.parseInt(nk[0]);

			int k = Integer.parseInt(nk[1]);

			int[] a = new int[n];

			String[] aItems = bufferedReader.readLine().split(" ");

			for (int i = 0; i < n; i++) {
				int aItem = Integer.parseInt(aItems[i]);
				a[i] = aItem;
			}

			String result = angryProfessor(k, a);

			bufferedWriter.write(result);
			bufferedWriter.newLine();
		}

		bufferedWriter.close();

	}

	static String angryProfessor(int k, int[] a) {
		int result = 0;
		for(int i=0; i< a.length;i++) {
			if(a[i] <= 0) {
				result ++;
			}
		}
		if(result >= k) {
			return "NO";
		}else {
			return "YES";
		}

	}
}
