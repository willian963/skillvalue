package com.rackerrank.minmaxsum;

public class MinMaxSum {
	public static void main(String[] args) {
		//int[] ar = new int[] { 1, 2, 3, 4, 5};
		//int[] ar = new int[] {256741038, 623958417, 467905213, 714532089, 938071625};
		//2063136757 2744467344
		
		int[] ar = new int[] {396285104, 573261094, 759641832, 819230764, 364801279};
		//2093989309 2548418794
		miniMaxSum(ar);
	}

	// Complete the miniMaxSum function below.
	static void miniMaxSum(int[] arr) {
		if (null != arr && arr.length > 0) {
			Long sum = new Long(0);
			Long size = new Long(arr.length - 1);
			Long biggestSum = new Long(0);
			Long minorSum = new Long(0);
			while (size >= 0) {
				for (int i = 0; i < arr.length; i++) {
					if (i != size) {
						sum = sum + arr[i];
					}
				}
				size--;
				if (sum >= biggestSum) {
					biggestSum = sum;
				}
				if (sum <= minorSum || minorSum == 0) {
					minorSum = sum;
				}
				sum = new Long(0);
			}
			if (minorSum > 0 && biggestSum > 0 && minorSum <= biggestSum) {
				System.out.println(minorSum + " " + biggestSum);
			}
		}

	}

}
