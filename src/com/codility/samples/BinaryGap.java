 package com.codility.samples;

import java.util.Arrays;
import java.util.stream.IntStream;

public class BinaryGap {

	public void solution(int N) {

		String binaryString = Integer.toBinaryString(N);
		System.out.println(binaryString + "of" + N);
		int returnResult = 0;
		if (binaryString.contains("0")) {
			int[] indexOfOne = IntStream.range(0, binaryString.length())
					.filter(index -> binaryString.charAt(index) == '1').toArray();

			if (indexOfOne.length > 1)
				returnResult = IntStream.range(1, indexOfOne.length).map(i -> (indexOfOne[i] - indexOfOne[i - 1]) - 1)
						.reduce((diff1, diff2) -> Math.max(diff2, diff1)).orElse(0);
		}
		System.out.println("returnResult" + returnResult);
	}

}
