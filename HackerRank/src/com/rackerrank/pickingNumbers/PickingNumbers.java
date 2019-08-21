package com.rackerrank.pickingNumbers;

import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import javax.lang.model.element.NestingKind;

public class PickingNumbers {

	public static void main(String[] args) throws IOException {
		FileReader fileIn = new FileReader(System.getProperty("user.dir") + "/Inputs/PickingNumbersInput.txt");
		FileWriter fileOut = new FileWriter(System.getProperty("user.dir") + "/Outputs/PickingNumbersOutput.txt");

		BufferedReader bufferedReader = new BufferedReader(fileIn);
		BufferedWriter bufferedWriter = new BufferedWriter(fileOut);

		int n = Integer.parseInt(bufferedReader.readLine().trim());

		List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" ")).map(Integer::parseInt)
				.collect(toList());

		int result = PickingNumbers.pickingNumbers(a);

		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();

		bufferedReader.close();
		bufferedWriter.close();
	}

	public static int pickingNumbers(List<Integer> a) {
		int result = 0;
		List<Integer> compare = a;
		if (null != a) {

			List<Integer> newArray = new ArrayList<Integer>();
			for (int i = 0; i <= a.size(); i++) {
				for (int j = 0; j <= compare.size(); j++) {
					if (null != compare.get(j + 1)) {
						validateRule(newArray, a.get(i), a.get(j + 1));
					}
				}
				validateNewArray(newArray);

			}
		}
		return result;
	}

	private static void validateNewArray(List<Integer> newArray) {
		// TODO Auto-generated method stub
		
	}

	private static void validateRule(List<Integer> newArray, int number, int nextNumber) {
		
		newArray.get(newArray.size());
		
		if (Math.abs(number - nextNumber) <= 1) {
			newArray.add(number);
		}

	}

}
