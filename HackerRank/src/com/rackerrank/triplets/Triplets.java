package com.rackerrank.triplets;

import java.util.ArrayList;
import java.util.List;

public class Triplets {
	public static void main(String[] args) {
		List<Integer> a = new ArrayList<Integer>(); 
		a.add(6);
		a.add(7);
		a.add(10);
		
		List<Integer> b = new ArrayList<Integer>(); 
		b.add(5);
		b.add(7);
		b.add(15);
		
		compareTriplets(a, b);
	}
	// Complete the compareTriplets function below.
    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        int resultValueA = 0;
        int resultValueB = 0;
        if(a.size() == b.size() && a.size() > 0 && b.size() > 0){
        for(int i = 0; i < a.size(); i++){
                if(a.get(i) > b.get(i)){
                    resultValueA++;
                }
                if(a.get(i) < b.get(i)){
                    resultValueB++;
                }       
        }
        result.add(resultValueA);
        result.add(resultValueB);
        System.out.println(result.toString());
        }
        return result;

    }
}
