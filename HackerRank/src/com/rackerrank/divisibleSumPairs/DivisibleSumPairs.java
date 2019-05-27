package com.rackerrank.divisibleSumPairs;

public class DivisibleSumPairs {
	public static void main(String[] args) {
		int[] ar = new int[] {1 ,2 ,3 ,4 ,5 ,6 };
		//int[] ar = new int[] {1 ,3 ,2 ,6 ,1 ,2 };
		//int[] ar = new int[] { 8, 10 };
		
		//int[] ar = new int[] {5 ,9 ,10 ,7 ,4};
		
		int n = 6;
		int k = 5;
		
		//System.out.println( (ar[0]+ar[1]) /k);
		//System.out.println( (ar[0]+ar[1]) %k);
		
		System.out.println(divisibleSumPairs(n, k, ar));
	}

	// Complete the divisibleSumPairs function below.
	static int divisibleSumPairs(int n, int k, int[] ar) {
		Integer result = 0;
		if (null != ar) {
			for (int i = 0; i < ar.length; i++) {
				for (int j = 1; j < ar.length; j++) {
					if ((i + j < ar.length && ar[i] + ar[i+j] == k)) {
						//if(ar[i] < ar[i+j]){
							System.out.println("[" + ar[i] + "," + ar[i+j] + "]");
						result++;
						//}
					}else
						if( i + j < ar.length && (ar[i]+ar[i+j])%k == 0){
							System.out.println("[" + ar[i] + "," + ar[i+j] + "]");
						result++;
					}
				}
			}
		}
		return result;
	}

}
