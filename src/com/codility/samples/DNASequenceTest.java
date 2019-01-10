package com.codility.samples;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class DNASequenceTest {

	 private static DNASequence dnaSequence;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		dnaSequence = new DNASequence();
	}

	@Test
	void test() {
	  
		String S = "CAGCCTA" ;
		int[] P = {2 , 5, 0};
		int[] Q = {4 , 5, 6};
		int[] R = {2 , 4, 1};		
		assertArrayEquals(R, dnaSequence.solution(S,P, Q));
	}
	
	/*@Test
	void testdata1() {
	  
		String S = "CAGCCTA" ;
		int[] P = {2 , 5, 6};
		int[] Q = {4 , 5, 6};
		int[] R = {2 , 4, 1};
		assertArrayEquals(R, dnaSequence.solution(S,P, Q));
	}

		@Test
	void testdata2() {
	  
		String S = "CAGCCTA" ;
		int[] P = {2 , 5, 6};
		int[] Q = {2 , 5, 6};
		int[] R = {3 , 4, 1};
		assertArrayEquals(R, dnaSequence.solution(S,P, Q));
	}
	
		@Test
	void testdata3() {
	  
		String S = "CAGCCTA" ;
		int[] P = {1 , 5, 6};
		int[] Q = {3 , 5, 6};
		int[] R = {1 , 4, 1};
		assertArrayEquals(R, dnaSequence.solution(S,P, Q));
	}
	
		@Test
	void testdata4() {
	  
		String S = "C" ;
		int[] P = {0};
		int[] Q = {0};
		int[] R = {2};
		assertArrayEquals(R, dnaSequence.solution(S,P, Q));
	}

		@Test
	void testdata5() {
	  
		String S = "CAGCCTA" ;
		int[] P = {1,1,2};
		int[] Q = {3,5,4};
		int[] R = {1,1,2};
		assertArrayEquals(R, dnaSequence.solution(S,P, Q));
	}*/
}
