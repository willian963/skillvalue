package com.rackerrank.migratoryBirds;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MigratoryBirds {

	public static void main(String[] args) {
		List<Integer> s = new ArrayList<Integer>();
		s.add(1);
		s.add(4);
		s.add(4);
		s.add(4);
		s.add(5);
		s.add(3);
		System.out.println(migratoryBirds(s));
	}

	// Complete the migratoryBirds function below.
	static int migratoryBirds(List<Integer> arr) {
		int minor = 1;
		int result = 0;
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		if (null != arr) {
			for (int i = 0; i < arr.size(); i++) {

				if (map.containsKey(arr.get(i))) {
					map.put(arr.get(i), map.get(arr.get(i)) + 1);
				} else {
					map.put(arr.get(i), 1);
				}
			}

			for (int i = 0; i < arr.size(); i++) {
				if (null != map.get(i)) {
					if (map.get(i) > minor) {
						minor = map.get(i);
						result = i;
					}
				}
			}

		}

		return result;
	}
}
