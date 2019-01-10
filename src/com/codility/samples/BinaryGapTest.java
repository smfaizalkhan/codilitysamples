package com.codility.samples;



import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class BinaryGapTest {
	
	private static BinaryGap binaryGap;
	
	@BeforeAll
	private static void setUp() {	
		binaryGap = new BinaryGap();
	}

	@Test
	void testNormal() {
		 binaryGap = new BinaryGap();
		binaryGap.solution(51712);
	}
	
	@Test
	void testLowerBoundary() {
		 binaryGap = new BinaryGap();
		binaryGap.solution(32);
	}

	@Test
	void testHigherBoundary() {
		 binaryGap = new BinaryGap();		 
		binaryGap.solution(Integer.MAX_VALUE);
	}
	
	@Test
	void testLowerBoundary15() {
		 binaryGap = new BinaryGap();
		binaryGap.solution(15);
	}
	
	@Test
	void testLowerBoundary529() {
		 binaryGap = new BinaryGap();
		binaryGap.solution(529);
	}


	@Test
	void testLowerBoundary1041() {
		 binaryGap = new BinaryGap();
		binaryGap.solution(1041);
	}
	
	@Test
	void testLowerBoundary5() {
		 binaryGap = new BinaryGap();
		binaryGap.solution(5);
	}
	
	@Test
	void testLowerBoundary328() {
		 binaryGap = new BinaryGap();
		binaryGap.solution(328);
	}
}
