package com.rackerrank.bonAppetit;

import java.util.ArrayList;
import java.util.List;

public class BonAppetit {

	public static void main(String[] args) {
		List<Integer> bill = new ArrayList<Integer>();
		bill.add(3);
		bill.add(10);
		bill.add(2);
		bill.add(9);
		
		int k = 1;
		int b = 12;
		
		bonAppetit(bill, k, b);
	}
	
	// Complete the bonAppetit function below.
    static void bonAppetit(List<Integer> bill, int k, int b) {
    	int sum = 0;
    	if(null != bill) {
    		for(int i=0; i < bill.size(); i++) {
    			if(bill.get(i) != bill.get(k)) {
    				sum = sum + bill.get(i);
    			}
    		}
    	}
    	sum = sum/2;
    	if(Math.abs(sum - b) != 0) {
    		System.out.println(Math.abs(sum - b));
    	}else {
    		System.out.println("Bon Appetit");
    	}

    }
}
