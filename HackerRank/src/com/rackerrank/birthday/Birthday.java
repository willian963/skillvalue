package com.rackerrank.birthday;

import java.util.ArrayList;
import java.util.List;

public class Birthday {

	public static void main(String[] args) {
		List<Integer> s = new ArrayList<Integer>();
		s.add(2);
		s.add(5);
		s.add(1);
		s.add(3);
		s.add(4);
		s.add(4);
		s.add(3);
		s.add(5);
		s.add(1);
		s.add(1);
		s.add(2);
		s.add(1);
		s.add(4);
		s.add(1);
		s.add(3);
		s.add(3);
		s.add(4);
		s.add(2);
		s.add(1);
		
		
		int d = 18;
		int m = 7;

		System.out.println(birthday(s, d, m));
	}

	static int birthday(List<Integer> s, int d, int m) {
		int sum = 0;
		int result = 0;
		if (null != s) {
			if(s.size()-1 > 0) {
			for (int i=0; i < s.size()-1; i++) {
				for (int j = 0; j < m; j++) {
					if(i+j < s.size()) {
					sum = sum + s.get(i+j);
					}
				}
				if(sum == d) {
					result++;
				}
				sum = 0;
			}
		}else {
			if(s.get(0) == d) {
				result++;
			}
		}
		}
		return result;
	}
}
