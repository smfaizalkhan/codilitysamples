package com.codility.samples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class DNASequence {

	public int[] solution(String S, int[] P, int[] Q) {
		System.out.println(" ");
		Map<String, Integer> nucletoidImpactFactor = new HashMap<String, Integer>();
		nucletoidImpactFactor.put("A", 1);
		nucletoidImpactFactor.put("C", 2);
		nucletoidImpactFactor.put("G", 3);
		nucletoidImpactFactor.put("T", 4);
		List<Integer> leastImpactFoctor = new ArrayList<Integer>();

		for (int i = 0; i < P.length; i++) {

			List<Integer> impactFactorArray = S.subSequence(P[i], Q[i] + 1).chars()
					.map(charac -> nucletoidImpactFactor.get(Character.toString((char) charac))).boxed()
					.collect(Collectors.toList());

			impactFactorArray.stream().reduce((num1, num2) -> Math.min(num2, num1))
					.ifPresent(val -> leastImpactFoctor.add(val));

		}
		leastImpactFoctor.forEach(value -> System.out.print(" " + value));
		int[] leastImpactFacVal = leastImpactFoctor.stream().mapToInt(val -> val).toArray();
		return leastImpactFacVal;

		/*
		 * List<Integer> impactFactorArray = IntStream.range(0, P.length).mapToObj(i ->
		 * S.substring(P[i], Q[i] + 1)) .flatMapToInt(val -> val.chars()) .map(charc ->
		 * nucletoidImpactFactor.get(String.valueOf((char) charc))).boxed()
		 * .collect(Collectors.toList());
		 */

	}
}
