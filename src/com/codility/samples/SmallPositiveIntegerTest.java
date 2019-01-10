package com.codility.samples;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class SmallPositiveIntegerTest {

	private static SmallPositiveInteger smallPositiveInteger ;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		smallPositiveInteger = new SmallPositiveInteger();
	}

	@Test
	void test() {
		int[] A = {1, 3, 6, 4, 1, 2};
		assertEquals(5, smallPositiveInteger.solution(A));
	}

	@Test
	void testdata2() {
		int[] A = {1, 2, 3};
		assertEquals(4, smallPositiveInteger.solution(A));
	}
	
	@Test
	void testdata3() {
		int[] A = {-1, -2, -3};
		assertEquals(1, smallPositiveInteger.solution(A));
	}
	
	@Test
	void testdata4() {
		int[] A = {};
		assertEquals(1, smallPositiveInteger.solution(A));
	}
	
	@Test
	void testdata5() {
		int[] A = {100,1,3,3,3,6,7,8,2,9,5,4,344,345,678,23423,34535434,67867,2342342};
		assertEquals(10, smallPositiveInteger.solution(A));
	}
	
	@Test
	void testdata6() {
		int[] A = {100,3,3,3,6,7,8,2,9,5,4,344,345,678,23423,34535434,67867,2342342};
		assertEquals(1, smallPositiveInteger.solution(A));
	}
	
	@Test
	void testdata7() {
		int[] A = {1};
		assertEquals(2, smallPositiveInteger.solution(A));
	}
	
	@Test
	void testdata8() {
		int[] A = {2};
		assertEquals(1, smallPositiveInteger.solution(A));
	}
	
	@Test
	void testdata9() {
		int[] A = {3};
		assertEquals(1, smallPositiveInteger.solution(A));
	}
}
