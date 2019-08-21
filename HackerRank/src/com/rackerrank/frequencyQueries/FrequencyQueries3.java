package com.rackerrank.frequencyQueries;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FrequencyQueries3 {

	public static void main(String[] args) throws IOException {

		System.out.println("Running...");
		Instant startD = Instant.now();

		FileReader fileIn = new FileReader(System.getProperty("user.dir") + "/Inputs/FrequencyQueriesInput.txt");
		FileWriter fileOut = new FileWriter(System.getProperty("user.dir") + "/Outputs/FrequencyQueriesOutput.txt");

		BufferedReader bufferedReader = new BufferedReader(fileIn);
		BufferedWriter bufferedWriter = new BufferedWriter(fileOut);

		int q = Integer.parseInt(bufferedReader.readLine().trim());

		List<List<Integer>> queries = new ArrayList<>();

		IntStream.range(0, q).forEach(i -> {
			try {
				queries.add(Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
						.map(Integer::parseInt).collect(toList()));
			} catch (IOException ex) {
				throw new RuntimeException(ex);
			}
		});

		List<Integer> ans = freqQuery(queries);

		bufferedWriter.write(ans.stream().map(Object::toString).collect(joining("\n")) + "\n");

		bufferedReader.close();
		bufferedWriter.close();

		System.out.println("Finish!!!");
		System.out.println("Total Time = " + Duration.between(startD, Instant.now()).getSeconds() + " sec");
	}

	static List<Integer> freqQuery(List<List<Integer>> queries) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		ArrayList<Integer> afterThreeValid = new ArrayList<>();
		List<Integer> ans = new ArrayList<>();
		HashMap<Integer, Integer> map = new HashMap<>();
		for (List<Integer> list : queries) {
			Integer resultFromRule = validateRule(list, arr, map, afterThreeValid);
			if (resultFromRule != -1) {
				ans.add(resultFromRule);
			}
		}
		return ans;
	}

	private static Integer validateRule(List<Integer> list, ArrayList<Integer> arr, HashMap<Integer, Integer> map,
			ArrayList<Integer> afterThreeValid) {
		Integer result = -1;

		switch (list.get(0)) {
		case 1:
			addOnList(list, arr, afterThreeValid);
			break;
		case 2:
			removeFromList(list, arr, afterThreeValid);
			break;
		case 3:
			result = (validateList(list, afterThreeValid, map));
			afterThreeValid.clear();
			break;
		default:
		}

		return result;
	}

	private static Integer validateList(List<Integer> list, ArrayList<Integer> afterThreeValid,
			HashMap<Integer, Integer> map) {
		Integer result = 0;
		for (Integer num : afterThreeValid) {
			if (!map.containsKey(num)) {
				map.put(num, 1);

			} else {
				map.put(num, map.get(num) + 1);
			}
		}
		result = validateNumberOccur(list, map);
		return result;

	}

	private static Integer validateNumberOccur(List<Integer> list, HashMap<Integer, Integer> map) {
		Integer result = 0;
		Integer numberOccur = list.get(1);

		for (Map.Entry<Integer, Integer> val : map.entrySet()) {
			if (numberOccur == val.getValue()) {
				result = 1;
				break;
			}
		}

		return result;
	}

	private static void removeFromList(List<Integer> list, ArrayList<Integer> arr, ArrayList<Integer> afterThreeValid) {
		if (arr.contains(list.get(1))) {
			arr.remove(list.get(1));
		}
		if (afterThreeValid.contains(list.get(1))) {
			afterThreeValid.remove(list.get(1));
		}
	}

	private static void addOnList(List<Integer> list, ArrayList<Integer> arr, ArrayList<Integer> afterThreeValid) {
		arr.add(list.get(1));
		afterThreeValid.add(list.get(1));
	}
}
