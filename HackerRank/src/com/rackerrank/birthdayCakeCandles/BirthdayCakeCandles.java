package com.rackerrank.birthdayCakeCandles;

public class BirthdayCakeCandles {
	
	public static void main(String[] args) {
		int[] ar = new int[] { 3, 2, 1, 3};
		System.out.println(birthdayCakeCandles(ar));
	}
	
	// Complete the birthdayCakeCandles function below.
    static int birthdayCakeCandles(int[] ar) {
    	int result = 0;
    	int biggest = 0;
    	if(null != ar && ar.length > 0){
    		for(int i : ar){
    			if(i > biggest){
    				biggest = i;
    			}
    		}
    		for(int i : ar){
    			if(i == biggest){
    				result++;
    			}
    		}
    	}
    	return result;
    }

}
