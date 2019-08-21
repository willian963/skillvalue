package com.rackerrank.pickingNumbers;

import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Stream;

import javax.lang.model.element.NestingKind;

public class PickingNumbers2 {

	public static void main(String[] args) throws IOException {
		FileReader fileIn = new FileReader(System.getProperty("user.dir") + "/Inputs/PickingNumbersInput.txt");
		FileWriter fileOut = new FileWriter(System.getProperty("user.dir") + "/Outputs/PickingNumbersOutput.txt");

		BufferedReader bufferedReader = new BufferedReader(fileIn);
		BufferedWriter bufferedWriter = new BufferedWriter(fileOut);

		int n = Integer.parseInt(bufferedReader.readLine().trim());

		List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" ")).map(Integer::parseInt)
				.collect(toList());

		int result = PickingNumbers2.pickingNumbers(a);

		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();

		bufferedReader.close();
		bufferedWriter.close();
	}

	public static int pickingNumbers(List<Integer> a) {
		int result = 0;
		if (null != a) {
			HashMap<Integer, Integer> map = new HashMap<>();
			List<Integer> newArray = new ArrayList<Integer>();

			for (Integer num : a) {
				if (!map.containsKey(num)) {
					map.put(num, 1);
				} else {
					map.put(num, map.get(num).intValue() + 1);
				}
			}

			result = valiteRule(a, newArray, map);
		}

		return result;
	}

	private static int valiteRule(List<Integer> a, List<Integer> newArray, HashMap<Integer, Integer> map) {
		int biggerNumber = 0;
		for (int i = 0; i < a.size(); i++) {
			biggerNumber = validateRuleNumbers(a, newArray, map, biggerNumber, a.get(i) + 1, i);
			biggerNumber = validateRuleNumbers(a, newArray, map, biggerNumber, a.get(i) - 1, i);
		}

		return biggerNumber;
	}

	private static int validateRuleNumbers(List<Integer> a, List<Integer> newArray, HashMap<Integer, Integer> map,
			int biggerNumber, int numberValidate, int position) {
		newArray.clear();
		validatePosition(a, newArray, map, numberValidate, position);
		biggerNumber = resolveBiggerValue(newArray, biggerNumber);
		return biggerNumber;
	}

	private static int resolveBiggerValue(List<Integer> newArray, int biggerNumber) {
		if (newArray.size() > biggerNumber) {
			biggerNumber = newArray.size();
		}
		return biggerNumber;
	}

	private static void validatePosition(List<Integer> a, List<Integer> newArray, HashMap<Integer, Integer> map,
			int numberValidate, int position) {
		int currentValue = a.get(position);
		
		if (map.containsKey(currentValue)) {
			for (int j = 0; j < map.get(currentValue).intValue(); j++) {
				newArray.add(currentValue);
			}
		}
		
		if (map.containsKey(numberValidate)) {
			for (int j = 0; j < map.get(numberValidate).intValue(); j++) {
				newArray.add(numberValidate);
			}
		}
	}

}
