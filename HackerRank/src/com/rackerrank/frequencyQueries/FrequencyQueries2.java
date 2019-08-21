package com.rackerrank.frequencyQueries;

import static java.util.stream.Collectors.joining;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FrequencyQueries2 {

	public static void main(String[] args) throws IOException {
		
		System.out.println("Running...");
		Instant startD = Instant.now();
		
		FileReader fileIn = new FileReader(System.getProperty("user.dir") + "/Inputs/FrequencyQueriesInput.txt");
		FileWriter fileOut = new FileWriter(System.getProperty("user.dir") + "/Outputs/FrequencyQueriesOutput.txt");
		
	    try (BufferedReader bufferedReader = new BufferedReader(fileIn)) {
	      int q = Integer.parseInt(bufferedReader.readLine().trim());
	      List<int[]> queries = new ArrayList<>(q);
	      Pattern p  = Pattern.compile("^(\\d+)\\s+(\\d+)\\s*$");
	      for (int i = 0; i < q; i++) {
	        int[] query = new int[2];
	        Matcher m = p.matcher(bufferedReader.readLine());
	        if (m.matches()) {
	          query[0] = Integer.parseInt(m.group(1));
	          query[1] = Integer.parseInt(m.group(2));
	          queries.add(query);
	        }
	      }
	      List<Integer> ans = freqQuery(queries);
	      try (BufferedWriter bufferedWriter = new BufferedWriter(fileOut)) {
	        bufferedWriter.write(
	                ans.stream()
	                        .map(Object::toString)
	                        .collect(joining("\n"))
	                        + "\n");
	      }
	    }
	    
	    System.out.println("Finish!!!");
        System.out.println("Total Time = " + Duration.between(startD, Instant.now()).getSeconds() + " sec");
	  }

	static List<Integer> freqQuery(List<int[]> queries) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		List<Integer> ans = new ArrayList<>();
		HashMap<Integer,Integer> map = new HashMap<>();
		for (int[] list : queries) {
			Integer resultFromRule = validateRule(list, arr, map);
			if(resultFromRule != -1) {
				ans.add(resultFromRule);
			}
		}
		return ans;
	}

	private static Integer validateRule(int[] list, ArrayList<Integer> arr, HashMap<Integer, Integer> map) {
		Integer result = -1;
		ArrayList<Integer> afterThreeValid = new ArrayList<>();
		switch (list[0]) {
		case 1:
			addOnList(list, arr);
			afterThreeValid = arr;
			break;
		case 2:
			removeFromList(list, arr);
			afterThreeValid = arr;
			break;
		case 3:
			result = (validateList(list, afterThreeValid, map));
			afterThreeValid.clear();
			break;
		default:
		}
		Collections.sort(arr); 
		return result;
	}

	private static Integer validateList(int[] list, ArrayList<Integer> arr, HashMap<Integer, Integer> map) {
		Integer result = 0;
		for(Integer num : arr) {
			if(!map.containsKey(num)) {
				map.put(num, 1);
				
			}else {
				map.put(num, map.get(num)+1);
			}
		}
		result = validateNumberOccur(list, map);
		return result;
		
	}

	private static Integer validateNumberOccur(int[] list, HashMap<Integer,Integer> map) {
		Integer result = 0;
		Integer numberOccur = list[1];
		
		for (Map.Entry<Integer, Integer> val : map.entrySet()) { 
			if(numberOccur == val.getValue()) {
				result = 1;
				break;
			}
		}
		
		return result;
	}

	private static void removeFromList(int[] list, ArrayList<Integer> arr) {
		int nRemove =  list[1];
		if(arr.contains(nRemove)) {
			int idex = arr.indexOf(nRemove);
			arr.remove(idex);
		}
	}

	private static void addOnList(int[] list, ArrayList<Integer> arr) {
		arr.add(list[1]);
	}
}
