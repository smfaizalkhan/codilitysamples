package com.codility.samples;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class OddArrayOccurence {

	public void solution(int[] A) {

		Map<Integer, Integer> oddMap = new HashMap<Integer, Integer>();

		// for (int i = 0; i < A.length; i++) {
		// oddMap.put(A[i],oddMap.getOrDefault(A[i],0)+1);
		// }
		//
		// for(Map.Entry<Integer,Integer> countOfVal: oddMap.entrySet()) {
		// System.out.println("key"+countOfVal.getKey());
		// System.out.println("Value"+countOfVal.getValue());
		// }

		Arrays.stream(A).boxed().forEach(val -> oddMap.put(val, oddMap.getOrDefault(val, 0) + 1));

		System.out.println(
				oddMap.entrySet().stream().filter(countVal -> Integer.remainderUnsigned(countVal.getValue(), 2) != 0)
						.map(ele -> ele.getKey()).findFirst().orElse(0));

	}

}
