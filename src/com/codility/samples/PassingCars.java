package com.codility.samples;

public class PassingCars {

	public int solution(int[] A) {

		int zeroCount = 0;
		int totPairCount = 0;

		if(A.length < 1) return -1;
		for (int i = 0; i < A.length; i++) {
			if (A[i] == 0) {
				zeroCount = zeroCount + 1;
			}

			if (A[i] == 1) {
				totPairCount = totPairCount + zeroCount;
			}
		}

		return (totPairCount > 1000000000) ? -1 : totPairCount;
	}

}
