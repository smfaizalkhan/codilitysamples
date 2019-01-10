package com.codility.samples;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Triangular {

	public int solution(int[] A) {
		Arrays.sort(A);

		for (int i = A.length - 1; i >= 2; i--) {

			if ((A[i] + A[i - 1] > A[i - 2]) && (A[i] + A[i - 2] > A[i - 1]) && A[i - 1] + A[i - 2] > A[i]) {
				return 1;

			}
		}
		return 0;

	}

}
