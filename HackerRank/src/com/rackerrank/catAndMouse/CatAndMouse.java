package com.rackerrank.catAndMouse;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CatAndMouse {

	public static void main(String[] args) throws IOException {
		FileReader fileIn = new FileReader(System.getProperty("user.dir") + "/Inputs/CatAndMouseInput.txt");
		FileWriter fileOut = new FileWriter(System.getProperty("user.dir") + "/Outputs/CatAndMouseOutput.txt");

		BufferedReader bufferedReader = new BufferedReader(fileIn);
		BufferedWriter bufferedWriter = new BufferedWriter(fileOut);

		int q = Integer.parseInt(bufferedReader.readLine().trim());

		for (int qItr = 0; qItr < q; qItr++) {
			String[] xyz = bufferedReader.readLine().split(" ");

			int x = Integer.parseInt(xyz[0]);

			int y = Integer.parseInt(xyz[1]);

			int z = Integer.parseInt(xyz[2]);

			String result = catAndMouse(x, y, z);

			bufferedWriter.write(result);
			bufferedWriter.newLine();
		}

		bufferedWriter.close();

	}

	static String catAndMouse(int x, int y, int z) {
		String result = "";
		int distCatA = Math.abs(x - z);
		int distCatB = Math.abs(y - z);
		
		if(distCatA < distCatB) {
			result = "Cat A";
		}
		if(distCatA > distCatB) {
			result = "Cat B";
		}
		if(distCatA ==  distCatB) {
			result = "Mouse C";
		}
		return result;
	}
}
