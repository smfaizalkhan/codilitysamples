package com.codility.samples;

import java.util.Arrays;
import java.util.Objects;
import java.util.function.BiFunction;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MissingElement {

	public int solution(int[] A) {

		if (Objects.isNull(A))
			return 0;

		if (A.length == 0)
			return 1;
		Arrays.sort(A);
		int missingElement = 0;
		int startIndex = 0;
		int endIndex = A.length - 1;
		int differenceInIndex = (endIndex - startIndex);

		while (differenceInIndex > 1) {

			int midIndex = ((differenceInIndex) / 2) + startIndex;
			if ((A[midIndex] - midIndex) > 1) {
				endIndex = midIndex;
			}
			if (A[midIndex] - midIndex == 1) {
				startIndex = midIndex + 1;
			}
			differenceInIndex = endIndex - startIndex;
		}

		if (differenceInIndex == 1) {
			if (A[startIndex] - startIndex > 1)
				missingElement = A[startIndex] - 1;
			else if (A[endIndex] - endIndex > 1)
				missingElement = A[endIndex] - 1;

		}

		if (differenceInIndex == 0 && (A[startIndex] - startIndex) > 1)
			missingElement = A[startIndex] - 1;
		System.out.println("missing element" + missingElement);
		return missingElement == 0 ? A.length + 1 : missingElement;
		

		

	}

}
