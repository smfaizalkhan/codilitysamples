package com.dailycoding.prob;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TwoNumbersAddToOne {

	public boolean  solution(int[] a, int k) {
		List<Integer> valueComplement = new ArrayList<Integer>();
		
		for (int i : a) {
			valueComplement.add(k-i);
		}
		for (int i : a) {
			if(valueComplement.contains(i))
				return true;
		}
		return false;
	
	}

}
