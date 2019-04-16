package com.codility.amazontest;

import java.util.ArrayList;

public class TestTwo {

	public static void main(String args[]) {
		int [] a = {1,12,42,70,36,-4,43,15};
		int [] b = {5,15,44,72,36,2,69,24};
		ArrayList<Integer> result = new ArrayList<Integer>();
		
		int menorA = 0;
		int biggerB =0;
		
		if (null != a && a.length > 0) {
			for (int arrayA : a) {
				if (arrayA < menorA) {
					menorA = arrayA;
				}
			}
		}

		if (null != b && b.length > 0) {
			for (int arrayB : b) {
				if (arrayB > biggerB) {
					biggerB = arrayB;
				}
			}
		}
		
		result = findInterval(a,result,menorA);
		//result = findInterval(b,result,biggerB);
		
		String clean = result.toString().replaceAll("[, ;]", "");
		clean = clean.replaceAll("[\\[\\](){}]", "");
		Integer n = Integer.valueOf(clean);
		System.out.println(n);
	}
	
	private static ArrayList<Integer> findInterval(int[] values , ArrayList<Integer> result, int compare){
		for(int i = 0; i < values.length; i++){
			if(compare == values[i]){
				result.add(i);
			}
		}
		return result;
	}
}

