package com.rackerrank.simpleArraySum;

public class SimpleArraySum {
	
	public static void main(String[] args) {
		int[] ar = new int[] { 1, 2, 3, 4, 10, 11};
		System.out.println(simpleArraySum(ar));
	}

	static int simpleArraySum(int[] ar) {
		int result = 0;
		if(null != ar && ar.length > 0){
			for(int i : ar){
				result = result + i;
			}
		}
		return result;
	}
}
