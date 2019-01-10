package com.codility.samples;



import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class OddOccurenceArrTest {

	 private static OddArrayOccurence oddOccuerence;
	@BeforeAll
	public static void test() {
		oddOccuerence  = new OddArrayOccurence();
	}
	
	@Test
	public void testSol() {
		int[] A = {9,3,9,3,9,7,9};
		oddOccuerence.solution(A);
	}

}
