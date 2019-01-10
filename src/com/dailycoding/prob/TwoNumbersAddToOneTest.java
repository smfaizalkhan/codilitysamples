package com.dailycoding.prob;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class TwoNumbersAddToOneTest {

	 private static TwoNumbersAddToOne twoSumToOne;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		twoSumToOne = new TwoNumbersAddToOne();
	}

	@Test
	void test() {
		int []A = {10, 15, 3, 7}; 
	    int K =17;	
	   assertTrue(twoSumToOne.solution(A,K));
	}

	@Test
	void testdata1() {
		int []A = {10, 15, 3, 8}; 
	    int K =17;	
	   assertFalse(twoSumToOne.solution(A,K));
	}

}
